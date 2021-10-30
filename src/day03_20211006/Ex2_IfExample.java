package day03_20211006;

import java.util.Scanner;

public class Ex2_IfExample {

	public static void main(String[] args) {
		// 정수 하나를 입력받아 입력받은 정수가 3의배수인지 5의배수인지 3과5의 공배수인지 아니면
		// 3의배수도 5의배수도 아닌지를 출력하는 코드를 작성하세요.

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");

		int num = scan.nextInt();

		if (num > 0) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("3과 5의 배수이다.");
			} else if (num % 5 == 0) {
				System.out.println("5의 배수이다.");
			} else if (num % 3 == 0) {
				System.out.println("3의 배수이다.");
			} else {
				System.out.println("3의 배수도 5의배수도 아니다.");
			}
		} else {
			System.out.println("숫자를 다시 입력하세요.");
		}
		
		

	}

}
