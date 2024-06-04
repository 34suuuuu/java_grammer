package C01Basic;

public class C03Operator {
	public static void main(String[] args) {
	//	산술연산자 : 사칙연산
	// 	int n1 = 8, n2 = 3;
	// //	*:곱셉, /:나머지, %:나머지
	// 	System.out.println("n1 + n2 = " + (n1 + n2));
	// 	System.out.println("n1 - n2 = " + (n1 - n2));
	// 	System.out.println("n1 * n2 = " + (n1 * n2));
	// 	System.out.println("n1 / n2 = " + (n1 / n2));
	// 	System.out.println("n1 / n2 = " + ((double)n1 / n2));
	// 	System.out.println("n1 % n2 = " + (n1 % n2));

	// // 대입 연산자
	// 	int n1 = 7, n2 = 7, n3 = 7;
	// 	n1 = n1 - 3;
	// 	n2 -= 3;
	// 	System.out.println(n1);
	// 	System.out.println(n2);
	//
	// 	int n4 = 10, n5 = 10;
	// 	n4 /=3;
	// 	System.out.println(n4);
	// 	n5 %= 3;
	// 	System.out.println(n5);
	//
	// //	증감연산자
	// 	int a = 10;
	// 	a = a + 1;
	// 	System.out.println(a); // 11
	// 	a += 1;
	// 	System.out.println(a);// 12
	// 	a++; // 13후위증감연산자
	// 	++a; // 14전위증감연산자
	// 	System.out.println(a);
	//
	// //	후위증감연산자
	// 	int b = 5;
	// 	int c = b++; // 실행문이 끝나고 b가 증가
	// 	int d = ++b; // 실행문이 끝나기 전에 b가 증가
	// 	System.out.println(c); //5
	// 	System.out.println(d); //7
	//
	// //	비교 연산자 : ==, !=, >, >= 등
	// 	char ch1 = 'a';
	// 	char ch2 = 'b';
	// 	System.out.println(ch1 == ch2);	//false
	// 	System.out.println(ch1 != ch2);	//true

	//	논리 연산자 : &&, ||,!
		int num1 = 10, num2 = 20;
		boolean result1;
		result1 = (num1 > 5) && (num1 < 20); // true
		System.out.println(result1);
		boolean result2 = !(num2 < 10) || (num2 < 30); // true
		System.out.println(result2);

	//	비트 연산자 : &, | , ^, ~
		int n1 = 5; // 101
		int n2 = 4; // 100
		int n3 = n1 & n2; // 100
		System.out.println(n3);
		int n4 = n1 | n2; // 101
		System.out.println(n4);
		int n5 = n1 ^ n2; // 1
		System.out.println(n5);
		System.out.println(~n5);
	//	시프트 연산 : <<(왼쪽으로 이동), >>(오른쪽이동)
	//	왼쪽으로 한칸이동한다는 의미는 2를 곱한다는 의미
		System.out.println(n4 << 1);
	}
}
