package day02_20211005;

import java.util.Scanner;

public class Ex4_Calculatur {

	public static void main(String[] args) {
		// 간단한 덧셈 계산기
		// 스캐너를 이용하여 정수 2개를 각각 입력받고 입력받은 숫자 합 출력
		
		Scanner scan = new Scanner (System.in);
		
		int num1, num2 = 0;
//		
		System.out.print("num1: ");
		num1 = scan.nextInt();
//		
		System.out.print("num2: ");
		num2 = scan.nextInt();
		
		System.out.println("num1+num2: " + (num1+num2));
	}

}