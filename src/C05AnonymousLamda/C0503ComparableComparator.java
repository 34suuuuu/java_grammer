package C05AnonymousLamda;

import javax.naming.Name;
import java.util.*;

public class C0503ComparableComparator {
	public static void main(String[] args) {
		//        자바에서는 비교를 위한 인터페이스 2개 제공 : Comparable, Comparator
		//        Comparable 인터페이스에는 compareTo 메서드
		//        Comparator 인터페이스에는 compare 메서드 선언

		//        String 클래스에 compareTo 내장(Comparable 구현)
		//        String 클래스 외에 java 많은 내장 클래스에서 Comparable 구현
		//        String a = "hello";
		//        String b = "horld";
		//
		////        두 문자열의 각 자리를 순차적으로 비교
		////        문자열의 비교는 유니코드값의 차이를 반환
		//        System.out.println(a.compareTo(b));
		//
		////        Integer a1 = 10;
		////        Integer a2 = 10;
		////        System.out.println(a1.compareTo(a2));
		//
		//        List<String> myList = new ArrayList<>();
		//        myList.add("java");
		//        myList.add("python");
		//        myList.add("javascript");
		//        Collections.sort(myList);   // Comparable의 compareTo 메서드를 구현하여 정렬
		//        System.out.println(myList);
		//        Collections.sort(myList, Comparator.reverseOrder());
		//        System.out.println(myList);
		//        myList.sort(Comparator.naturalOrder());
		//        myList.sort(Comparator.reverseOrder());

		// List<Student> students = new ArrayList<>();
		// students.add(new Student("kim",19));
		// students.add(new Student("lee",29));
		// students.add(new Student("aprk",15));
		// students.add(new Student("sksi",30));
		// students.add(new Student("kim",25));
		//
		// System.out.println(students);
		//        방법1. Student객체에서 Comparable을 구현 => compareTo 메서드를 오버라이딩
		//        Collections.sort(students);
		//        for(int i=0; i<students.size(); i++){
		//            System.out.println(students.get(i).getName()+students.get(i).getAge());
		////            System.out.println(students.get(i).getAge());;
		//        }

		//        방법2. Comparator를 구현한 익명객체를 sort에 주입
		//        Comparator<Student> myComparator = new Comparator<Student>() {
		//            @Override
		//            public int compare(Student o1, Student o2) {
		////                return o1.getAge()-o2.getAge();
		//                return o1.getName().compareTo(o2.getName());
		//            }
		//        };
		//        students.sort(myComparator);
		//        for(Student s : students){
		//            System.out.println(s.getName()+ s.getAge());;
		//        }
		//        students.sort((a,b)->a.getName().compareTo(b.getName()));
		//        for(Student s : students){
		//            System.out.println(s.getName()+ s.getAge());;
		//        }

		//        아래 문자열을 글자길이 순서로 내림차순 정렬
		// String arr[] = {"hello", "java", "c++", "world2"};
		//        Arrays.sort(arr,Comparator.reverseOrder());

		//        Arrays.sort(arr, new Comparator<String>() {
		//            @Override
		//            public int compare(String o1, String o2) {
		//                return o2.length()-o1.length();
		//            }
		//        });
		//        System.out.println(Arrays.toString(arr));

		//        Arrays.sort(arr,(a,b)->b.length()-a.length());
		//        System.out.println(Arrays.toString(arr));

		//        [4,5], [1,2], [5,0], [3,1] 내림차순
		//        List<int[]> myList = new ArrayList<>();
		//        myList.add(new int[]{4, 5});
		//        myList.add(new int[]{1, 2});
		//        myList.add(new int[]{5, 0});
		//        myList.add(new int[]{3, 1});
		//        myList.sort((a,b) ->b[1]-a[1]);
		//
		//        for(int[]a : myList){
		//            System.out.println(Arrays.toString(a));
		//        };

			   // 1번째로 내림차순
			   // 1번째가 같으면 0번쨰로 내림차순
		       // List<int[]> myList = new ArrayList<>();
		       // myList.add(new int[]{4, 5});
		       // myList.add(new int[]{1, 2});
		       // myList.add(new int[]{5, 5});
		       // myList.add(new int[]{3, 1});
		// 	   Comparator<int[]> myComparator = new Comparator<int[]>() {
		// 		   @Override
		// 		   public int compare(int[] o1, int[] o2) {
		// 			   if (o1[1] == o2[1]) {
		// 				   return o2[0] - o1[0];
		// 			   }else
		// 				   return o2[1] - o1[1];
		// 		   }
		// 	   };
		// myList.sort(myComparator);

		       // myList.sort((a,b) -> {
		       //     if(a[1] == b[1]){
				// 	   return b[0] - a[0];
		       //     }else
				// 	   return b[1] - a[1];
		       // });
		       // for(int[]a : myList){
		       //     System.out.println(Arrays.toString(a));
		       // };
			   //
		// String stArr[] = {"hello", "java", "c++", "world2"};
		//
		// Queue<String> pq = new PriorityQueue<>((o1,o2) -> {
		// 	return o2.length() - o1.length();
		// });
		// for (String s : stArr) {
		// 	pq.add(s);
		// }
		//
		// while (!pq.isEmpty()) {
		// 	System.out.println(pq.poll());
		// }

		// 프로그래머스) 가장 큰 수
		// int[] numbers = new int[] {3, 30, 34, 5, 9};
		// List<String> list = new ArrayList<>();
		// for (int i : numbers) {
		// 	list.add(String.valueOf(i));
		// }
		//
		// list.sort((o1,o2) -> (o2 + o1).compareTo(o1 + o2));
		//
		// String answer = "";
		// for (String s : list) {
		// 	answer += s;
		// }
		// if (answer.charAt(0) == '0') {
		// 	answer = "0";
		// }
		// System.out.println(answer);


		// 쓰레드 구현 방법 : 쓰레드 상속, Runnable 주입
		//Runnable 인터페이스 : 쓰레드 구현
		Thread t1 = new Thread((new Runnable() {
			@Override
			public void run() {
				System.out.println("새로 생성한 쓰레드1 입니다.1");
				System.out.println("새로 생성한 쓰레드1 입니다.2");
				System.out.println("새로 생성한 쓰레드1 입니다.3");
				System.out.println("새로 생성한 쓰레드1 입니다.4");
				System.out.println("새로 생성한 쓰레드1 입니다.");
			}
		}));
		t1.start();
		Thread t2 = new Thread(() -> System.out.println("새로 생성한 쓰레드2 입니다."));
		t2.start();
		new Thread(() -> System.out.println("새로 생성한 쓰레드3 입니다.")).start();
		System.out.println("main 쓰레드 입니다.");

	}
}
//class Student implements Comparable<Student>
class Student{
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	//    모든 클래스의 조상클래스인 Object클래스이 toString 메서드를 Overriding하여
	//    객체 호출시에 자동으로 toString 메서드 호출
	@Override
	public String toString(){
		return "이름 :" +this.name + ", 나이 : " +this.age;
	}

	//    @Override
	//    public int compareTo(Student s) {
	//        return this.age - s.getAge();
	//    }
	////    public int compareTo(Student s) {
	////        return this.name.compareTo(s.getName());
	////    }
}