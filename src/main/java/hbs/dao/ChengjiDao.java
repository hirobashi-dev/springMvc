package hbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hbs.bean.Chengji;
import hbs.util.Dbconn;

public class ChengjiDao {

	public List<Chengji> getChengji(int id){

		List<Chengji> listChengji=new ArrayList<Chengji>();
		Connection conn=null;

		/*DBからデータ取得*/
		try {
			conn=Dbconn.getConn();

			String sql = "select * from EXAM_RESULTS where STUDENT_ID=?";

			PreparedStatement  stmt = conn.prepareStatement(sql);

			stmt.setInt(1, id);
			ResultSet rset=stmt.executeQuery();

			while(rset.next()) {
				listChengji.add(new Chengji(rset.getInt(1),rset.getString(2),rset.getInt(3)));
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

		return listChengji;
	}

}
