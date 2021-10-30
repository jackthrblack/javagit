package day02_20211005;

import java.util.Scanner; //java.until 패키지에 소속된 Scanner 클래스를 import
//import => 어느 소속의 누구를 가져올 것이냐.
public class Ex3_Scanner {

	public static void main(String[] args) {
		// Scanner 활용
		// 스캐너 객체를 선언해야 활용 가능
		Scanner scan = new Scanner(System.in);
		// scan 만 바꿀수 있고 나머지는 그대로 있어야 사용가능
		// new => 새로운 객체(인스턴스)를 선언할 때 사용하는 자바문법
		// Scanner => 클래스
		// Scanner(System.in); => Scanner class의 생성자(객체 생성양식)
		//(System.in)=> 매개변수, 사람을 통해서 시스템 안에 무엇을 준다.
		// 콘솔 -> 프린트
		int num1 = 0;
//		System.out.println(num1);
		
//		// Scanner를 이용하여 num1에 데이터 입력
//		System.out.print("숫자를 입력하세요: "); //println() => ()안에 있는 내용을 출력하고 줄을 바꿈
//		num1 = scan.nextInt(); //Scanner 클래스가 가지고 있는 nextInt() 메서드 호출
//		System.out.println(num1);
//		
//		String name = "";
//		System.out.print("이름을 입력하세요: ");
//		name = scan.next(); //문자열 메서드, 띄어쓰기 전까지만 인지
//		System.out.println(name);
//		scan.nextLine(); //
//		
//		System.out.print("이름을 입력하세요: ");
//		name = scan.nextLine(); // 엔터 입력 전까지의 값을 다 인지 
//		System.out.println(name);
		
		int num = scan.nextInt();

		if(num>=0){
			System.out.println("정수입니다.");
		} else{
			System.out.println("음수입니다.");
		}
	}

}