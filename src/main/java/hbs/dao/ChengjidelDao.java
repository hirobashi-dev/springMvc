package hbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import hbs.bean.ChengjiImpl;
import hbs.util.Dbconn;

public class ChengjidelDao {

	public boolean deldao(List<ChengjiImpl> dellist) {
		Connection conn=null;
		int rst=0;

		/*DBからデータ削除*/
		try {
			conn=Dbconn.getConn();
			String sql = "delete EXAM_RESULTS where STUDENT_ID=? and SUBJECT=?";
			PreparedStatement  stmt = conn.prepareStatement(sql);
			for (ChengjiImpl chengjiImpl : dellist) {
				stmt.setInt(1, chengjiImpl.getStudent_id());
				stmt.setString(2, chengjiImpl.getSubject());
				rst=stmt.executeUpdate();

				System.out.println(rst);
			}
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

		return true;

	}

}
