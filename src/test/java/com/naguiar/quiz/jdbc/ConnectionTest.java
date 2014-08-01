/**
 * 
 */
package com.naguiar.quiz.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author naty
 *
 */
public class ConnectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		connectionTest();
		
	}

	/**
	 * Connection Test
	 */
	private static void connectionTest() {
		
		try {
			Connection connection = new ConnectionFactory().getConnection();
			System.out.println("Connection is open: " + connection.isValid(1));
			connection.close();
			System.out.println("Connection is closed: " + !connection.isValid(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
