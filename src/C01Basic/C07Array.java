package C01Basic;

import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
	public static void main(String[] args) {
	// //	배열 표현식1 : 리터럴 방식
	// 	int[] intArr1 = {1, 2, 3, 4, 5};
	//
	// //	배열 표현식2 : 선언 후 할당방식
	// 	int[] intArr2 = new int[5];
	// 	intArr2[0] = 1;
	// 	intArr2[1] = 2;
	// 	intArr2[2] = 3;
	// 	intArr2[3] = 4;
	// 	System.out.println(intArr2[4]);	//0으로 초기화
	//
	// 	for (int i : intArr2) {
	// 		System.out.println(i);
	// 	}
	// 	for (int i = 0; i < intArr2.length; i++) {
	// 		System.out.println(intArr2[i]);
	// 	}
	//
	// // 	표현식3
	// 	int[] intArr3 = new int[] {1, 2, 3, 4};
	//
	// //	표현식4 : 불가 -> 배열의 길이는 사전에 지정되어야함
	// // 	int[] intArr4 = new int[];
	//
	// 	String[] strArr = new String[5];
	// 	strArr[0] = "hello";
	// 	strArr[1] = "java";
	// //	NullPointerException
	// // 	System.out.println(strArr[2].length());
	//
	// 	String[] strArr2 = new String[5];
	// 	Arrays.fill(strArr2, "java");
	// 	System.out.println(strArr[3]);
	//
	// //	86,65,90인 int 배열을 선언하고, 총합, 평균을 구해보자
	// 	int[] arr = new int[3];
	// 	arr[0] = 86;
	// 	arr[1] = 65;
	// 	arr[2] = 90;
	//
	// 	int total = 0;
	// 	for (int i : arr) {
	// 		total += i;
	// 	}
	// 	int avg = total / arr.length;
	// 	System.out.println("총합 : " + total);
	// 	System.out.println("평균 : " + (total/arr.length));

	// //	최대값,최소값
	// 	int[] arr = {10, 20, 30, 12, 8, 17};
	// 	int max = arr[0];	//Integer.MIN_VALUE로도 셋팅가능
	// 	int min = arr[0];	//Integer.MAX_VALUE로도 셋팅가능
	// 	for (int i = 0; i < arr.length; i++) {
	// 		if (arr[i] > max) {
	// 			max = arr[i];
	// 		}
	// 		if (arr[i] < min) {
	// 			min = arr[i];
	// 		}
	// 	}
	// 	System.out.println("max: " + max);
	// 	System.out.println("min: " + min);

	// //	배열의 순서바꾸기
	// 	int[] arr = {10, 20};
	// 	int tmp = arr[0];
	// 	arr[0] = arr[1];
	// 	arr[1] = tmp;
	//
	// 	int[] arr2 = {10, 20, 30, 40, 50};
	// //	0번째 index부터 마지막 index까지 순차적으로 자리 change
	// 	for (int i = 0; i < arr2.length - 1; i++) {
	// 		int temp = arr2[i];
	// 		arr2[i] = arr2[i + 1];
	// 		arr2[i + 1] = temp;
	// 	}
	// 	System.out.println(Arrays.toString(arr2));	// [20,30,40,50,10]

	// //	배열 뒤집기
	// 	int[] arr = {1, 2, 3, 4};
	// //	새로운 배열에 위 arr을 뒤집은 값 셋팅
	// 	int[] new_arr = new int[arr.length];
	// 	for (int i = 0; i < arr.length; i++) {
	// 		new_arr[i] = arr[arr.length - i - 1];
	// 	}
	// 	System.out.println(Arrays.toString(new_arr));	// [4,3,2,1]

	//	숫자 뒤집기
	//	문자열과 관련된 풀이로 풀기
	// 	4321 문자열로 출력이 되도록
	// 	int num = 1234;
	// 	StringBuilder sb = new StringBuilder();
	// 	String numStr = Integer.toString(num);
	// 	int len = numStr.length();
	// 	for (int i = 0; i < len; i++) {
	// 		sb.append(numStr.charAt(len - i - 1));
	// 	}
	// 	System.out.println(sb);

	// //	정렬
	// 	int[] arr = {5, 1, 2, 7, 3, 1, 2};
	// 	Arrays.sort(arr); // 오름차순 정렬이 기본
	// 	System.out.println(Arrays.toString(arr));
	//
	// //	문자 졍렬
	// //	아스키코드 기준으로 => 대문자가 소문자보다 아스키코드 숫자가 낮다
	// 	String[] fruits = {"banana", "apple", "cherry", "Apple"};
	// 	Arrays.sort(fruits);
	// 	System.out.println(Arrays.toString(fruits));
	//
	// //	문자열의 index 순서로 비교
	// 	String[] fruits2 = {"apple", "apple11", "apple2"};
	// 	Arrays.sort(fruits2);
	// 	System.out.println(Arrays.toString(fruits2));
	//
	// //	내림차순
	// 	String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
	// 	Arrays.sort(st_arr, Comparator.reverseOrder());
	// 	System.out.println(Arrays.toString(st_arr));
	//
	// //	기본형타입은 Comparator로 처리 불가
	// 	int[] intArr = {5, 1, 2, 7, 3, 1, 2};
	// 	// Arrays.sort(intArr, Comparator.reverseOrder());
	// 	Arrays.sort(intArr);
	// //	방법1. 오름차순 정렬 후 배열 뒤집기
	//
	// //	방법2. streamapi, lambda를 활용한 내림차순 정렬
	// 	int[] answer = Arrays.stream(intArr)//intArr를 대상으로 Stream
	// 		.boxed()    //int요소를 Integer로 형변환 시키는 메서드
	// 		.sorted(Comparator.reverseOrder())
	// 		.mapToInt(a -> a)// Integer를 int로 형변환
	// 		.toArray(); // 배열로 전환

	}

}
