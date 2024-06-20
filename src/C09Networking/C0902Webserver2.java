package C09Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class C0902Webserver2 {
	public static void main(String[] args) throws IOException {
		// 소켓이란 서버와 사용자가 통신을 하기 위한 네트워크 통신의 끝점을 나타내는 개녕
		ServerSocket serverSocket = new ServerSocket(8081);
		System.out.println("8082 서비스 시작");
		while (true) {
			// 	accept() : 클라이언트의 연결 요청을 수락
			Socket socket = serverSocket.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				sb.append(line + "\n");
			}
			String requestString = sb.toString();
			String firstLine = requestString.split("\n")[0];
			String infos = firstLine.split(" ")[1];
			String id = "";
			if (infos.contains("?")) {
				String st1 = infos.split("\\?")[1];
				String[] stArr = st1.split("&");
				for (String s : stArr) {
					String[] keyValue = s.split("=");
					if (keyValue[0].equals("id")) {
						id = keyValue[1];
					}
				}
			}
			System.out.println("id : " + id);
			// System.out.println(infos);
			String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "hello world";
			// UTF-8문자열 return
			socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
			// 	플러시란 일반적으로 변경사항을 확정(반영)하는 것을 의미
			socket.getOutputStream().flush();
			socket.close();
		}

	}
}
