package hbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import hbs.bean.Chengji;
import hbs.util.Dbconn;

public class RegisterDao {

	public int register(Chengji chengji) {
		Connection conn=null;
		int rset=0;

		/*DBからデータ取得*/
		try {
			conn=Dbconn.getConn();

			String sql = "insert into EXAM_RESULTS values(?,?,?)";

			PreparedStatement  stmt = conn.prepareStatement(sql);

			stmt.setInt(1, chengji.getStudent_id());
			stmt.setString(2, chengji.getSubject());
			stmt.setInt(3, chengji.getScore());
			rset=stmt.executeUpdate();

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

		return rset;

	}

}
