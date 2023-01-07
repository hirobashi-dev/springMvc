package hbs.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import hbs.bean.Student;
import hbs.util.Dbconn;

public class StudentDao {


	public List<Student> getStudents(){

		List<Student> students=new ArrayList<Student>();
		Connection conn=null;

		/*DBからデータ取得*/
		try {
			conn=Dbconn.getConn();
			Statement stmt = conn.createStatement();
			ResultSet  rset = stmt.executeQuery("select * from STUDENTS");

			while(rset.next()) {
				System.out.println(rset.getInt(1)+rset.getString(2)+rset.getString(3));
				students.add(new Student(rset.getInt(1),rset.getString(2),rset.getString(3),rset.getInt(4),rset.getString(5)));
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

		return students;
	}

}
