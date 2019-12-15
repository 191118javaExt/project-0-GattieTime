package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.models.Admin;
import com.revature.util.ConnectionUtil;

public class AdminDAOImp implements AdminDAO {

	@Override
	public Admin findByLogIn(String logIn) {
		
		Admin e = null;
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM administrator WHERE login = ?;";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, logIn);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String first = rs.getString("first_name");
				String last = rs.getString("last_name");
				int password = rs.getInt("password");
				boolean approved = rs.getBoolean("approved");

			 e = new Admin(id, first, last, logIn, password, approved);

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

	private static Logger logger = Logger.getLogger(AdminDAOImp.class);

	@Override
	public List<Admin> findAll() {
		List<Admin> list = new ArrayList<>();

		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM administrator;";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String first = rs.getString("first_name");
				String last = rs.getString("last_name");
				String login = rs.getString("login");
				int password = rs.getInt("password");
				boolean approved = rs.getBoolean("approved");

				Admin e = new Admin(id, first, last, login, password, approved);

				list.add(e);
			}
			rs.close();

		} catch (SQLException e) {
			logger.warn("Unable to retrieve all users", e);

		}
		return list;
	}

	@Override
	public Admin findById(int id) {
		
		Admin e = null;
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM administrator WHERE id = ?;";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String first = rs.getString("first_name");
				String last = rs.getString("last_name");
				String login = rs.getString("login");
				int password = rs.getInt("password");
				boolean approved = rs.getBoolean("approved");

			 e = new Admin(id, first, last, login, password, approved);

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
	public boolean insert(Admin e) {
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "INSERT INTO administrator (first_name, last_name, login, password, approved) "
					+ "VALUES (?, ?, ?, ?, ?);";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, e.getUserFirstName());
			stmt.setString(2, e.getUserLastName());
			stmt.setString(3, e.getUserLogIn());
			stmt.setInt(4, e.getUserPassword());
			stmt.setBoolean(5, e.isApproved());

			stmt.execute();

		} catch (SQLException ex) {
			logger.warn("Unable to insert administrator.", ex);
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Admin e) {
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "UPDATE administrator SET first_name = ?, last_name = ?, login = ?, password = ?, approved = ? "
					+ "WHERE id = ?;";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, e.getUserFirstName());
			stmt.setString(2, e.getUserLastName());
			stmt.setString(3, e.getUserLogIn());
			stmt.setInt(4, e.getUserPassword());
			stmt.setBoolean(5, e.isApproved());
			stmt.setInt(6, e.getUserID());

			stmt.execute();

		} catch (SQLException ex) {
			logger.warn("Unable to update administrator.", ex);
			return false;
		}
		return true;
	}

	@Override
	public List<Admin> findApprove() {
		List<Admin> list = new ArrayList<>();

		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM administrator WHERE approved = false;";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String first = rs.getString("first_name");
				String last = rs.getString("last_name");
				String login = rs.getString("login");
				int password = rs.getInt("password");
				boolean approved = rs.getBoolean("approved");

				Admin e = new Admin(id, first, last, login, password, approved);

				list.add(e);
			}
			rs.close();

		} catch (SQLException e) {
			logger.warn("Unable to retrieve all unapproved administrators", e);

		}
		return list;
	}
}
