package hbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import hbs.util.Dbconn;

public class MainDbupdate {

	public static void main(String[] args) {

		Connection conn=null;
		boolean rset=false;

		Map<String, Integer> upl=new HashMap<String, Integer>();
		upl.put("長岡 一馬", 17);
		upl.put("中本 知佳", 18);
		upl.put("松本 義文", 19);
		upl.put("佐竹 友香", 20);
		upl.put("小王", 21);


		/*DBからデータ取得*/
		try {
			conn=Dbconn.getConn();

			for(String key:upl.keySet()) {
				System.out.println(key +" : "+ upl.get(key));
			}

			for(Map.Entry<String, Integer> ent : upl.entrySet()) {

				String sql = "update students set AGE=? where NAME=?";

				PreparedStatement  stmt = conn.prepareStatement(sql);

				stmt.setInt(1, ent.getValue());
				stmt.setString(2, ent.getKey());

				rset=stmt.execute();
				stmt.close();
			}


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


	}

}
