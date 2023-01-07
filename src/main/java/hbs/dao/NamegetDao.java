package hbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import hbs.util.Dbconn;

public class NamegetDao {

	public String getName(int id){

		String name=null;
		Connection conn=null;

		/*DBからデータ取得*/
		try {
			conn=Dbconn.getConn();

			String sql = "select name from STUDENTS where ID=?";

			PreparedStatement  stmt = conn.prepareStatement(sql);

			stmt.setInt(1, id);
			ResultSet rset=stmt.executeQuery();

			if(rset.next()) {
				name=rset.getString(1);
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

		return name;
	}

}
