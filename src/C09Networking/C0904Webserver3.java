package C09Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C0904Webserver3 {
	public static void main(String[] args) throws SQLException, IOException {
		ServerSocket serverSocket = new ServerSocket(8081);
		Socket socket = serverSocket.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		StringBuilder sb = new StringBuilder();

		// 	mysql드라이버가 필요
		String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
		String userName = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("DB 연결 성공");

		// 	statement : 쿼리를 담아 db로 쿼리 전달하는 객체
		Statement st = con.createStatement();
		String myQuery;
		String line;
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			sb.append(line + "\n");
		}
		String requestString = sb.toString();
		String infos = requestString.split("\n")[0].split(" ")[1];

		String id = "", name="", email="";
		ResultSet rs;
		if (infos.contains("id")) {
			id = infos.split("=")[1];
			myQuery = "select * from author where id=" + id;
		} else {
			String st1 = infos.split("\\?")[1];
			String[] stArr = st1.split("&");
			for (String s : stArr) {
				String[] keyValue = s.split("=");
				if (keyValue[0].equals("name")) {
					name = keyValue[1];
				} else if (keyValue[0].equals("email")) {
					email = keyValue[1];
				}
			}
			myQuery = "select * from author where name=" + name + " and email = " + email;
		}
		rs = st.executeQuery(myQuery);
		while (rs.next()) {
			name = rs.getString("name");
			email = rs.getString("email");
			password = rs.getString("password");

			System.out.println("name : " + name + "\nemail : " + email + "\npassword : " + password);
		}

		socket.getOutputStream().flush();
		socket.close();
	}
}
