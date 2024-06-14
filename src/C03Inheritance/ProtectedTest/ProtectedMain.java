
//루트(최상단) 패키지는 src

package C03Inheritance.ProtectedTest;

import C03Inheritance.C0304ProtectedClass;

// *을 통해 패키지내에 모든 클래스 Import 가능
// *을 통해 패키지 내에 패키지까지 포함해서 모든 내용 import 불가능
// 즉, import java.* 불가능

public class ProtectedMain extends C0304ProtectedClass {
	public static void main(String[] args) {

		C0304ProtectedClass c1 = new C0304ProtectedClass();
		//	default 접근 불가
		// System.out.println(c1.s2);
		//	protected 접근 불가
		// System.out.println(c1.s2);

		ProtectedMain p1 = new ProtectedMain();
		//	default	 접근 불가
		// System.out.println(p1.s2);
	//	상속한 객체에서 protected 접근 불가
		System.out.println(p1.st3);

	}
}
