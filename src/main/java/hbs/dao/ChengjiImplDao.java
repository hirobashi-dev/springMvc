package hbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hbs.bean.ChengjiImpl;
import hbs.util.Dbconn;

public class ChengjiImplDao {

	public List<ChengjiImpl> getChengji(){

		List<ChengjiImpl> Chengjilist=new ArrayList<ChengjiImpl>();
		Connection conn=null;

		/*DBからデータ取得*/
		try {
			conn=Dbconn.getConn();

			String sql = "select ID,NAME,SUBJECT,SCORE from EXAM_RESULTS,STUDENTS where STUDENT_ID=ID";

			PreparedStatement  stmt = conn.prepareStatement(sql);
			ResultSet rset=stmt.executeQuery();

			while(rset.next()) {
				Chengjilist.add(new ChengjiImpl(rset.getInt(1),rset.getString(2),rset.getString(3),rset.getInt(4)));
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

		return Chengjilist;
	}

}
