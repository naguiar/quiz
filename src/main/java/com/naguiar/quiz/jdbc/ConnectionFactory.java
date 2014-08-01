/**
 * 
 */
package com.naguiar.quiz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author naty
 *
 */
public class ConnectionFactory {

	/**
	 * Mysql Connection Factory
	 * 
	 * @return
	 */
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/quiz", "root", "admin");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
