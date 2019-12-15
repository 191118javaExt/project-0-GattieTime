package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.models.Client;
import com.revature.util.ConnectionUtil;

public class ClientDAOImp implements ClientDAO {
	private static Logger logger = Logger.getLogger(ClientDAOImp.class);

	@Override
	public Client findByLogIn(String logIn) {
		
		Client e = null;
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM client WHERE logIn = ?;";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, logIn);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String first = rs.getString("first_name");
				String last = rs.getString("last_name");
				int password = rs.getInt("password");

			 e = new Client(id, first, last, logIn, password);

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
	public List<Client> findAll() {
		List<Client> list = new ArrayList<>();

		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM client;";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String first = rs.getString("first_name");
				String last = rs.getString("last_name");
				String login = rs.getString("login");
				int password = rs.getInt("password");

				Client e = new Client(id, first, last, login, password);

				list.add(e);
			}
			rs.close();

		} catch (SQLException e) {
			logger.warn("Unable to retrieve all users", e);

		}
		return list;
	}

	@Override
	public Client findById(int id) {
		
		Client e = null;
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "SELECT * FROM client WHERE id = ?;";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String first = rs.getString("first_name");
				String last = rs.getString("last_name");
				String login = rs.getString("login");
				int password = rs.getInt("password");

			 e = new Client(id, first, last, login, password);

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
	public boolean insert(Client e) {
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "INSERT INTO client (first_name, last_name, login, password) "
					+ "VALUES (?, ?, ?, ?);";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, e.getUserFirstName());
			stmt.setString(2, e.getUserLastName());
			stmt.setString(3, e.getUserLogIn());
			stmt.setInt(4, e.getUserPassword());

			stmt.execute();

		} catch (SQLException ex) {
			logger.warn("Unable to insert client.", ex);
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Client e) {
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "UPDATE client SET first_name = ?, last_name = ?, login = ?, password = ? "
					+ "WHERE id = ?;";

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, e.getUserFirstName());
			stmt.setString(2, e.getUserLastName());
			stmt.setString(3, e.getUserLogIn());
			stmt.setInt(4, e.getUserPassword());
			stmt.setInt(6, e.getUserID());

			if (!stmt.execute()) {
				return false;
			}

		} catch (SQLException ex) {
			logger.warn("Unable to update client.", ex);
		}
		return true;
	}

}
