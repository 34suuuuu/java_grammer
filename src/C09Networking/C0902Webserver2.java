package C09Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
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
			System.out.println(requestString);
			String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "hello world";
			// UTF-8문자열 return
			socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
			// 	플러시란 일반적으로 변경사항을 확정(반영)하는 것을 의미
			socket.getOutputStream().flush();
			socket.close();
		}

	}
}
