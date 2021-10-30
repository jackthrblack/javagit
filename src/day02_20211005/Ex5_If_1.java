package day02_20211005;

import java.util.Scanner;

public class Ex5_If_1 {

	public static void main(String[] args) {
		// if 연습
//		boolean con = false;
//		System.out.println("if문 실행 전");

		// 단일 if문
//		if(con) {
//			System.out.println("if문 내부");
//		}
//		System.out.println("if문 실행 후");

		// if else문 -> else 생략가능
//		if(con) {
//			System.out.println("조건이 true");
//		} else {
//			System.out.println("조건이 flase");
//		}
//		
//		System.out.println("if문 실행 후");

		// 스캐너로 정수를 입력받아 입력받는 정수가 양수인지 음수인지 출력
		// 0도 양수라 판단
		// (else if) 0은 0입니다. 라고 출력

		Scanner scan = new Scanner(System.in);
//		
//		int num1 = 0;
//		System.out.print("입력한 숫자: ");
//		num1 = scan.nextInt();

//		if(num1>=0) {
//			System.out.println("num1은 양수 입니다.");
//		} else{
//			System.out.println("num1은 음수 입니다.");		
//		}

//		if(num1>0) {
//			System.out.println("num1은 양수 입니다.");
//		} else if(num1==0) {
//			System.out.println("num1은 0 입니다.");
//		}  else{
//			System.out.println("num1은 음수 입니다.");	
//		}

		// 정수를 입력받아서 홀수, 짝수를 판단해보세요.
		// 0보다 큰 숫자에 대해서만 홀/짝 판단, 0이하의 숫자는 다시 입력
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();

//		if(num%2==0) {
//			System.out.println("num은 짝수 입니다.");
//		}else {
//			System.out.println("num은 홀수 입니다.");
//		}
		// 0보다 큰 숫자에 대해서만 홀/짝 판단, 0이하의 숫자는 다시 입력

		/*
		 * 중첩if if(양수/음수판단){ if(홀/짝 판단){ } else {
		 * 
		 * } else { 다시입력하세요. 출력 }
		 * 
		 */
		if (num > 0) {
			if (num % 2 == 0) {
				// num이 0보다 크고 num이 짝수
				System.out.println("짝수");
		} else {
				// num이 0보다 크고 num이 홀수
				System.out.println("홀수");
		}
		} else {
			// num이 0보다 작거나 같다
			System.out.println("0보다 큰 숫자를 입력하세요.");
		}

		// if문을 &&연산을 이용하여 if else if로 표현
		if (num > 0 && num % 2 == 0) {
			// num이 0보다 크고 num이 짝수
			System.out.println("짝수");
		} else if (num > 0 && num % 2 != 0) {
			// num이 0보다 크고 num이 홀수
			System.out.println("홀수");
		} else {
			// num이 0보다 작거나 같다
			System.out.println("0보다 큰 숫자를 입력하세요.");
		}

	}

}