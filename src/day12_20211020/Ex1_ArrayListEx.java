package day12_20211020;

import java.util.*; // => 자바 유틸 패키지가 갖는 클래스를 쓰는게 많을 경우. 여기에 소속된 모든것을 import하겠다는 의미

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

public class Ex1_ArrayListEx {

	public static void main(String[] args) {
		/*
		 * ArrayList에 영어로 된 단어 5개를 스캐너로 입력 받고
		 * 입력받은 단어를 모두 출력하시오.
		 * 그리고 입력받은 단어 중 가장 긴 단어를 출력하시오.
		 */

		Scanner scan = new Scanner(System.in);
		List<String> list1 = new ArrayList<>(); // 첫번째 <>와 두번째<>에 같은 타입이 들어갈 경우 두번째 <>는 생략가능

		for(int i =0; i<5; i++) {
			String str = scan.next();
			list1.add(str);
		}
			for(int i =0; i<list1.size(); i++) {
				System.out.println(list1.get(i));			
		}	
			
			int longWord = 0; //각 인덱스 값 길이 비교용.
			
			//0번 인덱스에 저잗ㅇ된 데이터의 길이값 출력
			//System.out.println(list1.get(0).length());
			for(int i =1; i<list1.size(); i++) {
				if(list1.get(longWord).length()<list1.get(i).length()) {
					longWord = i;
				}
			}
	System.out.println("가장긴단어: " +list1.get(longWord));

}
}
