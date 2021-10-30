package day06_20211012;

import java.util.Scanner;

public class Ex1_WhileEx {
	//상수 선언 => 변수는 언제나 값을 바꿀수 있는데 절대로 바꾸지 않을 변수를 선언하는것이다.
	public static final String ANSEWRC="종료";
	// 특정 메세드 안에서 선언하는것이 아닌 클래스 안에서 선언하는 것이다.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 '종료' 를 입력하세요.");
		String mesege = scan.nextLine();
		// 프로그램을 종료하는 키워드인 종료 가 절대로 바뀌지 않을 경우
		final String ANSWER = "종료";
		
		//ANSWER="다른값 저장";
		
		// final => 
		while(true) {
			
			if(mesege.equals("종료")) { // 스트링같은 클래스 타입에서는 ==는 안쓴다 
				System.out.println("프로그램 종료");
				break;
			}else if(mesege.equals("안녕")) {
				System.out.println("안녕");
			}
		} 
		
		
		//내가 헤맨 이유.
	// String에서 일치판단을 int와 같은 기본형타입을 비교할때 쓰는 "=="을 �㎢�.
}
}

//기본형 변수 = 실제값이 변수에 들어간다.
//참조형 변수 = 실제 값을 대입하는것이 아니라 주소값을 가지고 있다.
// 실제값은 주소를 찾아가면 있다.