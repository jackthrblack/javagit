package day04_20211007;

import java.util.Scanner;

public class Ex7_ForEx_2 {

	public static void main(String[] args) {
		// 정수하나 입력받음
		// 1부터 입력받은 정수까지의 숫자 중에서
		// 2의배수, 3의배수를 제외한 숫자의 총합

		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자입력: ");
		
		int num = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			//System.out.println(i);
			if (i % 2 == 0 || i % 3 == 0) {
								
			} else {
				sum+=i;
			}			
		}
		System.out.println(sum);
	}

}