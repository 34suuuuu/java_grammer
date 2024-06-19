package C07ExceptionParsing;

import java.sql.SQLException;
import java.util.Scanner;

public class C0701Exception {
	public static void main(String[] args){
		System.out.println("나눗셈 프로그램입니다.");
		Scanner sc = new Scanner(System.in);

	//	예외가 발생할 것으로 예상되는 코드에 try로 감싸고
	//	예외가 발생했을 때 대응하는 코드를 catch로 작성한다.
		try {
			System.out.println("분자 입력");
			int head = Integer.parseInt(sc.nextLine());
			System.out.println("분모 입력");
			int tail = Integer.parseInt(sc.nextLine());
			int result = head / tail;
			System.out.println("나눈 결과값은 " + result);

		//	예외는 catch 구문 순차적으로 검사
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누시면 안됩니다.");
			// 예외가 발생된 내역을 로그를 남기기 위함
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("숫자에 맞는 값은 입력해주세요");
			e.printStackTrace();
			//	Exception은 모든 예외의 조상 클래스
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
			e.printStackTrace();
		}finally {
			System.out.println("무조건 실행되는 구문입니다.");
		}
		System.out.println("감사합니다");

	//	throws : 예외처리 위임을 명시
		login("1234");
		try {
			login2("1234");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	//unchecked 예외에서는 throws키워드가 예외사항을 명시하는 용도로만 사용된다.
	static void login(String password) throws IllegalArgumentException {
		if (password.length() < 10) {
			// throw new : 예외를 강제로 발생
			// 예외는 기본적으로 메서드를 호출한쪽으로 전파
			// unchecked 예외는 예외처리가 강제되지 않음
			throw new IllegalArgumentException("비밀번호가 너무 짧습니다");
		}
	}

	static void login2(String password) throws SQLException{
	// 방법1. 직접 예외처리
		// try {
		// 	if (password.length() < 10) {
		// 		throw new SQLException("DB조회 상황에서 예외가 발생했습니다.");
		// 	}
		// } catch (SQLException e) {
		// 	System.out.println(e.getMessage());
		// 	e.printStackTrace();
		// }
	//방법2. 메서드를 호출한 쪽에 위임 : throws
		if (password.length() < 10) {
			throw new SQLException("DB조회 상황에서 예외가 발생했습니다.");
		}
	}





}
