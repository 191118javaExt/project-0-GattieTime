package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.models.Account;
import com.revature.util.ConnectionUtil;

public class AccountDAOImp implements AccountDAO {
	private static Logger logger = Logger.getLogger(AccountDAOImp.class);

	@Override
	public List<Account> findAll() {
		List<Account> list = new ArrayList<>();

		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM account;";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String acc_name = rs.getString("acc_name");
				int acc_type = rs.getInt("acc_type");
				int owner = rs.getInt("acc_owner");
				double balance = rs.getDouble("balance");
				boolean approved = rs.getBoolean("approved");
				
				Account e = new Account(id, owner, acc_name, acc_type, balance, approved);

				list.add(e);
			}
			rs.close();

		} catch (SQLException e) {
			logger.warn("Unable to retrieve all users", e);

		}
		return list;
	}

	@Override
public Account findById(int id) {
		
		Account e = null;
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM account WHERE id = ?;";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String acc_name = rs.getString("acc_name");
				int acc_type = rs.getInt("acc_type");
				int owner = rs.getInt("acc_owner");
				double balance = rs.getDouble("balance");
				boolean approved = rs.getBoolean("approved");
				
				e = new Account(id, owner, acc_name, acc_type, balance, approved);

			}
			rs.close();

			if (!stmt.execute()) {
				return null;
			}

		} catch (SQLException ex) {
			logger.warn("Unable to insert user.", ex);
		}
		return e;
	}

	@Override
	public List<Account> findByOwnerId(int id) {
		List<Account> list = new ArrayList<>();

		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM account WHERE acc_owner = ?;";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				int acc = rs.getInt("id");
				String acc_name = rs.getString("acc_name");
				int acc_type = rs.getInt("acc_type");
				double balance = rs.getDouble("balance");
				boolean approved = rs.getBoolean("approved");
				
				Account e = new Account(acc, id, acc_name, acc_type, balance, approved);
				
				list.add(e);

			}
			rs.close();

		} catch (SQLException e) {
			logger.warn("Unable to retrieve all users", e);

		}
		return list;
	}

	@Override
	public boolean insert(Account e) {
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "INSERT INTO account (acc_name, acc_type, acc_owner, balance, approved) "
					+ "VALUES (?, ?, ?, ?, ?);";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, e.getName());
			stmt.setInt(2, e.getType());
			stmt.setInt(3, e.getUserID());
			stmt.setDouble(4, e.getBalance());
			stmt.setBoolean(5, e.isApproved());

			stmt.execute();

		} catch (SQLException ex) {
			logger.warn("Unable to insert account.", ex);
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Account e) {
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "UPDATE account SET acc_name = ?, acc_type = ?, acc_owner = ?, balance = ?, approved = ?"
					+ "WHERE id = ?;";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, e.getName());
			stmt.setInt(2, e.getType());
			stmt.setInt(3, e.getUserID());
			stmt.setDouble(4, e.getBalance());
			stmt.setBoolean(5, e.isApproved());
			stmt.setInt(6, e.getAccID());

			if (!stmt.execute()) {
				return false;
			}

		} catch (SQLException ex) {
			logger.warn("Unable to update account.", ex);
		}
		return true;
	}

	@Override
	public List<Account> findApprove() {
		List<Account> list = new ArrayList<>();

		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM account WHERE approved = false;";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String acc_name = rs.getString("acc_name");
				int acc_type = rs.getInt("acc_type");
				int owner = rs.getInt("acc_owner");
				double balance = rs.getDouble("balance");
				boolean approved = rs.getBoolean("approved");
				
				Account e = new Account(id, owner, acc_name, acc_type, balance, approved);

				list.add(e);
			}
			rs.close();

		} catch (SQLException e) {
			logger.warn("Unable to retrieve all unapproved accounts", e);

		}
		return list;
	}

}
