package day03_20211006;

import java.util.Scanner;

public class Ex3_IfExample {

	public static void main(String[] args) {
		// 합격, 불합격 판단
		/*
		 * 학년, 점수를 각각 입력 받고 합격, 불합격을 판단한다. 조건 1~3학년: 점수가 60점 이상일 때 합격 4학년: 점수가 70점 이상일 때
		 * 합격 위의 두 조건을 만족하지 않을 때는 불합격
		 * 사전에 학년은 1~4, 점수는 0~100으로 입력
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("학년을 입력하세요: ");
		int grade = scan.nextInt();

		System.out.print("점수을 입력하세요: ");
		int score = scan.nextInt();

		if (grade > 0 && grade <= 3) {
			if (score >= 60) {
				System.out.println("합격");
			} else if (grade == 4 && score >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} 
		//else {
//			System.out.println("학년을 다시 입력하세요.");
//		}
		
//		if(score >=60) {
//			if(grade != 4) {
//				System.out.println("합격");
//			} else if(score >=70) {
//				System.out.println("합격");
//			} else {
//				System.out.println("불합격");
//			}
//		} else {
//			System.out.println("불합격");
//		}
	}
}
