package C09Networking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C0903DatabaseConnect {
	public static void main(String[] args) throws SQLException {
		// 	mysql드라이버가 필요
		String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
		String userName = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("DB 연결 성공");


	// 	statement : 쿼리를 담아 db로 쿼리 전달하는 객체
		Statement st = con.createStatement();
		String myQuery = "select * from post";
		ResultSet rs = st.executeQuery(myQuery);
		int id = 0;
		String title = "";
		while (rs.next()) {
			id = rs.getInt("id");
			title = rs.getString("title");
			System.out.println("id는 " + id + ", title은 " + title);
		}
	}
}
