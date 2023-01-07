package hbs.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconn {

	public static Connection getConn() {

		String url = "jdbc:oracle:thin:@localhost:1521:orahbs";
		String username = "hbs";
		String password = "hbs";
		Connection conn = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

}
