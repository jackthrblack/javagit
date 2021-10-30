package day06_20211012;

import java.util.Scanner;

public class Ex4_WhileEx4 {

	public static void main(String[] args) {
		// up%down
		// 1부터 100까지의 숫자를 입력
		// 랜덤한 숫자를 만들어 놓고 up & down하기

		Scanner scan = new Scanner(System.in);
		int count = 0;
		int num = 0;
		num = (int) (Math.random() * 100) + 1;

		while (true) {
			System.out.print("1부터 100까지의 숫자를 입력하세요 : ");
			int num2 = scan.nextInt();
			count++;
			if (num == num2) {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는 "+count+"번"+" 입니다." );
				break;
			} else if (num > num2) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (num < num2) {
				System.out.println("더 작은 수를 입력하세요.");
			}
		}

	}
}
