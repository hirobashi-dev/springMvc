package hbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import hbs.util.Dbconn;

public class LoginDao {

	public boolean chkLogin(String name,String pwd){

		boolean flg=false;
		Connection conn=null;

		/*DBからデータ取得*/
		try {
			conn=Dbconn.getConn();

			String sql = "select count(1) from LOGINUSER where NAME=? and PASD=?";

			PreparedStatement  stmt = conn.prepareStatement(sql);

			stmt.setString(1, name);
			stmt.setString(2, pwd);

			ResultSet rset=stmt.executeQuery();

			while(rset.next()) {
				if(rset.getInt(1) >0) {
					flg=true;
				}
			}

			rset.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

			}
		}

		return flg;
	}

}
