package hbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import hbs.bean.Student;
import hbs.util.Dbconn;

public class StudentInsertDao {

	public boolean register(Student student) {
		Connection conn=null;
		boolean rset=false;

		/*DBからデータ取得*/
		try {
			conn=Dbconn.getConn();

			String sql = "insert into students values(?,?,?,?,?)";

			PreparedStatement  stmt = conn.prepareStatement(sql);

			stmt.setInt(1, student.getId());
			stmt.setString(2, student.getName());
			stmt.setString(3, student.getGende());
			stmt.setInt(4, student.getAge());
			stmt.setString(5, student.getJyusyo());

			rset=stmt.execute();

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
