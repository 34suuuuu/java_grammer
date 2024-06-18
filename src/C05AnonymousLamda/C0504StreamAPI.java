package C05AnonymousLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;

public class C0504StreamAPI {
	public static void main(String[] args) {
		// int[] arr = {20, 10, 4, 12};
		// //	전통적인 방식의 데이터 접근 방식 : 메모리 주소접근
		// for (int i = 0; i < arr.length; i++) {
		// 	System.out.println(arr[i]);
		// }
		//
		// //	함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
		// //	java에서 함수형프로그래밍을 지원하기위한 라이브러리가 streamAPI
		// //	foreach : 스트림의 각 요소를 소모하면서 동작을 수행
		// // 	Arrays.stream(arr).forEach(a -> System.out.println(a));
		//
		// //	스트림의 생성 : .stream()
		// String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
		// // 	stream<클래스명> : 제네릭타입으로 stream객체가 생성
		// Stream<String> stream1 = Arrays.stream(stArr);
		// List<String> stList = new ArrayList<>(Arrays.asList(stArr));
		// Stream<String> stream2 = stList.stream();
		//
		// int[] intArr = {10, 20, 30, 40, 50};
		// //	기본형 자료는 별도의 stream제공
		// IntStream stream3 = Arrays.stream(intArr);
		//
		// List<Integer> myList = new ArrayList<>();
		// myList.add(10);
		// myList.add(20);
		// myList.add(30);
		//
		// Stream<Integer> stream4 = myList.stream();
		// // int가 아니라 Integer이기 떄문에 Intstream은 사용불가
		// // IntStream stream5 = myList.stream();

	// //  stream 변환 (중개연산) : filter, map, sorted, distinct, limit
	// 	String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
	// //	filter : 특정기준으로 대상을 filtering 하는 것, Stream<String>을 반환
	// //  제네릭의 타입소거 문제 발생
	// //  제네릭의 타입소거란 제네릭타입을 런타임시점에서는 제거하는 것을 의미
	// //	그래서, 타입이 소거된 Stream객체에서 배열로 변환하려면 타입이 뭔지를 명시해줘야함(타입캐스팅)
	// 	String[] newStArr = Arrays.stream(stArr).filter(a -> a.length() <= 4).toArray(a -> new String[a]);	//a변수에는 stream 요소의 갯수
	// //	메소드 참조 방식(매개변수가 추론가능할 때 생략하는 형식) : 클래스::메서드
	// 	String[] newStArr2 = Arrays.stream(stArr).filter(a -> a.length() <= 4).toArray(String[]::new);	//메소드 참조
	//
	// 	int[] intArr = {10, 10, 30, 40, 50};
	// 	int[] newIntArr = Arrays.stream(intArr).filter(a -> a <= 30).toArray();
	// 	System.out.println(Arrays.toString(newIntArr));
	//
	// //	distinct : 중복제거
	// 	int[] newIntArr2 = Arrays.stream(intArr).distinct().toArray();
	// 	System.out.println(Arrays.toString(newIntArr2));
	// 	int total = Arrays.stream(intArr).sum();
	// 	System.out.println(total);
	//
	// //	map : 기존의 스트림을 조작하여 새로운 스트림 반환
	// 	int[] newMapArr = Arrays.stream(intArr).map(a -> a * 10).toArray();
	// 	System.out.println(Arrays.toString(newMapArr));

	//	홀수찾기
	// 	int[] arr1 = {1, 2, 3, 4, 5, 6};
	//
	// // 	홀수만 담은 배열 생성 : filter
	// 	int[] newArr1 = Arrays.stream(arr1).filter(a -> a % 2 == 1).toArray();
	// 	System.out.println(Arrays.toString(newArr1));
	//
	// //	홀수만 담은 배열의 값을 제곱한 새로운 배열 생성 : filter, map
	// 	int[] newArr2 = Arrays.stream(arr1).filter(a -> a % 2 == 1).map(a -> a*a).toArray();
	// 	System.out.println(Arrays.toString(newArr2));
	//
	// //	홀수만 담은 배열의 값을 제곱한 새로운 배열 내림차순 정렬 생성 : filter, map, sorted
	// 	int[] newArr3 = Arrays.stream(arr1).filter(a -> a % 2 != 0).map(a -> a * a).sorted().toArray();
	// 	System.out.println(Arrays.toString(newArr3));
	//
	// //	mapToInt : IntStream형태로 반환해주는 map
	// 	String[] stArr = {"HTML", "CSS", "JAVASCRIPT", "JAVA"};
	// // 	각 문자열의 길이를 담은 새로운 int배열 생성
	// 	IntStream newArr5 = Arrays.stream(stArr).mapToInt(a -> a.length());
	// 	System.out.println(Arrays.toString(newArr5.toArray()));
	// 	IntStream newArr6 = Arrays.stream(stArr).mapToInt(a -> a.length()).limit(3);
	// 	System.out.println(Arrays.toString(newArr6.toArray()));

	//	스트림의 소모 -> sum:합계, reduce:누적합계, foreach(출력) e.d
	// 	int[] intArr = {10, 20, 30, 40};
	// 	Arrays.stream(intArr).forEach(a -> System.out.println(a));
	// 	Arrays.stream(intArr).forEach(System.out::println);
	// 	int intArrSum = Arrays.stream(intArr).sum();
	// 	// optional객체 : 값이 있을수도 있고, 없을 수도 있음을 명시한 객체
	// 	int intArrMax = Arrays.stream(intArr).max().getAsInt();
	// 	int intArrMin = Arrays.stream(intArr).min().getAsInt();
	// 	int intArrCount= (int)Arrays.stream(intArr).count();
	// 	int allMultiply = Arrays.stream(intArr).reduce(1, (a, b) -> a * b);
	// 	int allAdd = Arrays.stream(intArr).reduce(0, (a, b) -> a + b);
	// 	System.out.println(allMultiply);	// 240000
	// 	System.out.println(allAdd);	// 100
	// 	String[] stArr = {"hello", "java", "world"};
	// 	String stAllAdd = Arrays.stream(stArr).reduce("", (a, b) -> a + b);
	// 	System.out.println(stAllAdd);	//hellojavaworld

	//	findFirst : 첫번쨰 요소 반환
	// 	List<Student> students = new ArrayList<>();
	// 	students.add(new Student("kim", 20));
	// 	students.add(new Student("choi", 32));
	// 	students.add(new Student("lee", 25));
	// 	students.add(new Student("park", 22));
	// 	Student student = students.stream().filter(a -> a.age >= 30).findFirst().get();
	//
	// //	student객체 실습
	// //	1) 모든 객체의 평균 나이
	// 	int avgAge = (int)students.stream().mapToInt(a -> a.getAge()).average().getAsDouble();
	// 	System.out.println(avgAge);
	// //	2) 가장 어린 사람 찾기
	// 	Student youngMan = students.stream().sorted(((a,b)-> a.getAge() - b.getAge())).findFirst().get();
	// 	System.out.println(youngMan);
	// //	3) 30대의 이름을 String배열에 담기 몇명인지 출력
	// 	String[] nameArr = students.stream().filter(a -> a.getAge()>= 30).map(a->a.getName()).toArray(String[]::new);
	// 	System.out.println(Arrays.toString(nameArr));

	//	Optional객체 : 특정객체에 값이 없을지도 모른다는 것을 명시적으로 표현
	//	ofNullable : null이 있을 수도 있는 경우에 Optional 객체를 생성하는 메서드
	// 	Optional<String> opt1 = Optional.ofNullable(null);
	// 	String st1 = null;
	// 	if (opt1.isPresent()) {
	// 		System.out.println(opt1.get().compareTo("hello"));
	// 	} else {
	// 		System.out.println("값이 없습니다.");
	// 	}

	//	Optional객체 생성 3가지 방법
	// 	Optional<String> opt1 = Optional.empty();
	// 	Optional<String> opt2 = Optional.of("hello");	// null이 못들어감
	// 	Optional<String> opt3 = Optional.ofNullable("");	//값이 있어도 되고 없어도됨
	//
	// //	Optional객체 처리 방법 4가지
	// //	방법1. isPresent() 확인 후 get()
	// 	if (opt3.isPresent()) {
	// 		System.out.println(opt3.get().length());
	// 	}
	// //	방법2. orElse() : 값이 있으면 있는 값 return, 없으면 지정 값 return
	// 	System.out.println(opt3.orElse("").length());
	// //	방법3. orElseGet() : 값이 있으면 있는 값 return, 없으면 람다함수 실행
	// 	System.out.println(opt3.orElseGet(() -> new String("")).length());
	// //	방법4. orElseThrow() : 가장 중요, 값이 있으면 있는 값 return, 없으면 지정된 예외 강제 발생
	// //	개발에서 예외를 사용자에게 적절한 메시지 전달 목적으로 강제 발생시키는 경우도 존재.
	// 	System.out.println(opt3.orElseThrow(() -> new NoSuchElementException("값이 없습니다")).length());
	//
	// 	List<Student> students = new ArrayList<>();
	// 	students.add(new Student("kim", 30));
	// 	students.add(new Student("kim1", 21));
	// 	students.add(new Student("kim2", 23));
	// 	students.add(new Student("kim3", 25));
	//
	// //	방법1.
	// 	OptionalDouble answer = students.stream().filter(a -> a.getAge() >= 29).mapToInt(a -> a.getAge()).average();
	// 	if (answer.isPresent()) {
	// 		System.out.println(answer.getAsDouble());
	// 	} else {
	// 		System.out.println("값이 없습니다.");
	// 	}
	// 	System.out.println(answer);
	// //	 방법2
	// 	double answer2 = students.stream()
	// 		.filter(a -> a.getAge() >= 29)
	// 		.mapToInt(a -> a.getAge())
	// 		.average()
	// 		.orElseThrow(() -> new NoSuchElementException("값이 없습니다."));
	}
}
