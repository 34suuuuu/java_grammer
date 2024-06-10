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

	//	프로그래머스) K번째 수
	// 	int[] array = new int[] {1, 5, 2, 6, 3, 7, 4};
	// 	int[][] commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
	//
	// 	int len = commands.length;
	// 	int[] answer = new int[len];
	// 	int[] tmp;
	//
	// 	for (int i = 0; i < len; i++) {
	// 		int start = commands[i][0] - 1;
	// 		int end = commands[i][1];
	// 		tmp = new int[end-start];
	//
	// 		int idx = 0;
	// 		for (int j = start; j < end; j++) {
	// 			tmp[idx] = array[j];
	// 			idx++;
	// 		}
	// 		Arrays.sort(tmp);
	// 		answer[i] = tmp[commands[i][2]-1];
	// 	}

	//	선택정렬 알고리즘
	// 	int[] arr = {17, 20, 19, 25, 12};
	//
	// 	for (int i = 0; i < arr.length - 1; i++) {
	// 		int minValue = arr[i];
	// 		int idx = i;
	// 		for (int j = i + 1; j < arr.length; j++) {
	// 			if (minValue > arr[j]) {
	// 				minValue = arr[j];
	// 				idx = j;
	// 			}
	// 		}
	// 		int tmp = arr[i];
	// 		arr[i] = arr[idx];
	// 		arr[idx] = tmp;
	// 		System.out.println(Arrays.toString(arr));
	// 	}

	//	숫자 조합의 합 : 모두 각기 다른 숫자의 배열이 있을 때,
	//	만들어질 수 있는 2개의 조합의 합을 출력하라
	// 	int[] intArr = {10, 20, 30, 40, 50, 60};
	// 	for (int i = 0; i < intArr.length - 1; i++) {
	// 		for (int j = i + 1; j < intArr.length; j++) {
	// 			System.out.println(intArr[i] + " + " + intArr[j] + " =  " + (intArr[i]+intArr[j]));
	// 		}
	// 	}

	// 	배열의 복사
	// 	copyOf(배열, length), copyOfRange(배열, start, end)
	// 	int[] arr = new int[] {10, 20, 30, 40, 50};
	// 	int[] newArr1 = Arrays.copyOf(arr, 3);
	// 	System.out.println(Arrays.toString(newArr1));
	// 	int[] newArr2 = Arrays.copyOfRange(arr, 1, 4);
	// 	System.out.println(Arrays.toString(newArr2));

	// // 배열의 중복제거
	// 	int[] tmp = {10, 10, 5, 7, 40, 40, 10, 10};
	// //	5,7,10,10,10,10,40,40
	// //	list,set도 쓰지 말고 중복제거
	// //	hint: 옆의 숫자와 같은지 안같은지 비교
	// //	새로운 배열의 길이는 넉넉하게 tmp의 길이만큼배정후 추후 copyOfRange
	//
	// 	int[] newTmp = new int[tmp.length];
	// 	Arrays.sort(tmp);
	//
	// 	newTmp[0] = tmp[0];
	//
	// 	int idx = 0;
	// 	for (int i = 0; i < tmp.length; i++) {
	// 		if (i==0 || tmp[i] != tmp[i - 1]) {
	// 			newTmp[idx] = tmp[i];
	// 			idx++;
	// 		}
	// 		int[] answer = Arrays.copyOfRange(newTmp, 0, idx);
	// 		System.out.println(Arrays.toString(answer));
	// 	}

	// //	프로그래머스) 두 개 뽑아서 더하기
	// 	int[] numbers = {5,0,2,7};
	// 	int[] tmp = new int[numbers.length * numbers.length];
	//
	// 	int idx = 0;
	// 	for (int i = 0; i < numbers.length - 1; i++) {
	// 		for (int j = i + 1; j < numbers.length; j++) {
	// 			tmp[idx] = numbers[i] + numbers[j];
	// 			idx++;
	// 		}
	// 	}
	// 	tmp = Arrays.copyOf(tmp, idx);
	// 	Arrays.sort(tmp);
	//
	// 	idx = 0;
	// 	int[] answer = new int[tmp.length];
	// 	for (int i = 0; i < tmp.length; i++) {
	// 		if (i == 0 || tmp[i] != tmp[i - 1]) {
	// 			answer[idx] = tmp[i];
	// 			idx++;
	// 		}
	// 	}
	// 	answer = Arrays.copyOf(answer, idx);

	// 배열의 검색
	// 	int[] arr = {5, 3, 1, 8, 7};
	// 	for (int i = 0; i < arr.length; i++) {
	// 		if(arr[i] == 8)
	// 			System.out.println(i);
	// 	}

	//	이진 검색(Binary Search) - 이분탐색
	//	복잡도 O(logn)
	// 	int[] arr = {5, 3, 1, 8, 7, 5, 3, 1, 8, 7, 5, 3, 1, 8, 7};
	//
	// 	int[] arr = {1, 3, 6, 8, 9, 11 ,15};
	// //	사전에 오름차순 정렬이 되어 있어야 이진검색 가능
	// 	System.out.println(Arrays.binarySearch(arr, 15));

	// //	배열간 비교
	// 	int[] arr1 = {10, 20, 30};
	// 	int[] arr2 = {10, 20, 30};
	// 	System.out.println(arr1 == arr2);
	// //	Arrays.equals : 값과 순서까지 동일해야 true
	// 	System.out.println(Arrays.equals(arr1, arr2));

	// //	2차원 배열 선언과 할당
	// 	int[][] arr = new int[2][3];
	// 	arr[0][0] = 1;
	// 	arr[0][1] = 2;
	// 	arr[0][2] = 3;
	// 	arr[1][0] = 4;
	// 	arr[1][1] = 5;
	// 	arr[1][2] = 6;
	//
	// //	리터럴 방식으로 할당
	// 	int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
	//
	// //	2차원배열의 출력
	// 	System.out.println(Arrays.deepToString(arr2));
	//	2차원 가변배열 선언 후 할당
	// 	int[][] arr = new int[2][];
	// 	arr[0] = new int[3];
	// 	arr[1] = new int[4];

	//	가변배열 리터럴 방식

	// int[][] arr2 = {{10, 20}, {10, 20, 30}};
	//	[3][4]사이즈 배열을 선언한 뒤
	//	1~12까지 숫자값 각 배열에 할당 후 출력
	//	{1,2,3,4}, {5,6,7,8}, {9,10,11,12}
	//
	// 	int[][] arr = new int[3][4];
	// 	int num = 1;
	// 	for (int i = 0; i < arr.length; i++) {
	// 		for (int j = 0; j < arr[i].length; j++) {
	// 			arr[i][j] = num;
	// 			num++;
	// 		}
	// 	}
	// 	System.out.println(Arrays.deepToString(arr));

		// int[][] arr1 = {{1, 2}, {2, 3}};
		// int[][] arr2 = {{3, 4}, {5, 6}};
		// int[][] answer = new int[arr1.length][arr1[0].length];
		// for (int i = 0; i < arr1.length; i++) {
		// 	for (int j = 0; j < arr1[i].length; j++) {
		// 		answer[i][j] = arr1[i][j] + arr2[i][j];
		// 	}
		// }
		// 프로그래머스) 행렬의 덧셈

	//	가변 배열 실습 : 행의 길이(전체 배열의 길이)5 => {{x}, {x,x}, {x,x,x}...}
	// 	int[][] test = new int[5][];
	// 	for (int i = 0; i < test.length; i++) {
	// 		test[i] = new int[i + 1];
	// 		for (int j = 0; j < test[i].length; j++) {
	// 			test[i][j] = (i+1)*10;
	// 		}
	// 	}
	// 	System.out.println(Arrays.deepToString(test));



	}
}
