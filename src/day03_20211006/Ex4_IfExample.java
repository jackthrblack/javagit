package day03_20211006;

import java.util.Scanner;

public class Ex4_IfExample {

	public static void main(String[] args) {
		/*
		 * 서로 다른 숫자 3개를 각 각 입력받아 가장 큰 숫자 출력
		 * (같은 숫자는 입력하지 않는다고 가정.)
		 */

		Scanner scan = new Scanner(System.in);
		int num, num2, num3, big;
		
		System.out.print("첫 번째 숫자: ");
		num = scan.nextInt();
		
		System.out.print("두 번째 숫자: ");
		num2 = scan.nextInt();
		
		System.out.print("세 번째 숫자: ");
		num3 = scan.nextInt();
		
		if(num>num2 && num>num3) {
			big = num;
		} else if(num2>num && num2>num3) {
			big = num2;
		} else {
			big = num3;
		}
		System.out.println("big: " + big);
		
		//최댓값을 담는 변수를 하나 추가하여 중첩 if활용하기
		
		int max = 0;
		
		if(num>num2) {
			if(num>num3) {
				max = num;
			}else {
				max = num3;
			}
		}else {
			if(num2>num) {
				max = num2;
			}else {
				max = num3;
			}
		}
				
	}

}
