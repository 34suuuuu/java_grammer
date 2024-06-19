package C07ExceptionParsing.AuthorException;

import java.util.Scanner;

public class AuthorController {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IllegalArgumentException {

		AuthorService authorService = new AuthorService();

		while (true) {
			System.out.println("서비스 번호를 입력하세요\n 1.회원가입\n 2.로그인\n 0.종료\n");
			int input = Integer.parseInt(sc.nextLine());

			if (input == 1) {
				System.out.println("이름을 입력하세요");
				String name = sc.nextLine();
				System.out.println("이메일을 입력하세요");
				String email = sc.nextLine();
				System.out.println("비밀번호를 입력하세요");
				String password = sc.nextLine();

				try {
					authorService.register(name, email, password);
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				}

			} else if (input == 2) {
				System.out.println("이메일을 입력하세요");
				String email = sc.nextLine();
				System.out.println("비밀번호를 입력하세요");
				String password = sc.nextLine();

				try {
					authorService.login(email, password);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				break;
			}
		}
	}
}
