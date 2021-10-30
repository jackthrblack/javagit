package day03_20211006;

import java.util.Scanner;

public class Ex1_IfExample {

	public static void main(String[] args) {
		// 학점 계산
		// 0보다 작거나 100보다 큰 점수 입력에 대해서는 잘못입력하셨습니다. 출력
		
		/* 점수 하나 입력 받아서 학점 출력 (스캐너 입력하는거 제대로 숙지하기)
		 * 90~100 A
		 * 80~89 B
		 * 70~79 C
		 * 60~69 D
		 * 59이하 F
		 */
		// if의 조건식에는 boolean 형태의 타입이 와야한다.
		// 여기서 score를 int로 선언을 했으므로 조건식에서 90<=score<=100을 사용하면 이건 정수형 타입이다.
		// 따라서 조건식에는 90<=score && score<=100 이렇게 비교연산자와 함께 풀어야하는 문제다.
		
		Scanner scan= new Scanner(System.in);
		
		int score = 0;
		System.out.print("점수를 입력하세요: ");
		score = scan.nextInt();
		
		// A~F를 출력하는 출력문을 딱 하나만 쓰는 코드로 변경해보시오.
		String grade = "";
		
		//중첩 if문
		// 90~94 : A, 95~100:A+
		if(score>=0 && score<=100) {
			if(90<=score) {
				grade = "A";
			} else if(80<=score) {
				grade = "B";
			} else if(70<=score) {
				grade = "C";
			} else if(60<=score) {
				grade = "D";
			} else {
				grade = "F";
			} 
		}	  
		else {
			System.out.println("잘 못 입력했습니다.");
	} System.out.println(grade);
		

		
	}
}