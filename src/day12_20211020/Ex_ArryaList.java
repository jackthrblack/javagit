package day12_20211020;

import java.util.ArrayList;
import java.util.List;

public class Ex_ArryaList {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		//list1의 0번 인덱스에 저당된 데이터를 String 클래스 타입의 참조형 변수(객체) var1 에 저장
		
//		String var1 = list1.get(0);
//		System.out.println(var1);

		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(123);
		list2.add(1234);
		int num1 = 10; //기본형변수
		list2.add(num1);
		Integer num2 = 20; // Integer 클래스 타입의 참조형 변수
		list2.add(num2);
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		System.out.println(list2.get(3));
	}

}
