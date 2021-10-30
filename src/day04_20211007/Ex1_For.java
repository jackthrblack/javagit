package day04_20211007;

public class Ex1_For {

	public static void main(String[] args) {
		// 1부터 5까지 출력
		// 반복존건: 반복문 내용을 실행할지를 판단 하는 조건
		// => 조건을 만족(true)해야만 반복문 내용이 실행.
		for (int num1 = 1; num1 <= 3; num1++) {
			System.out.println(num1);
		}

		// System.out.println(num1);
		// for에서 사용한 변수는 for문 안에서만
		// 사용 가능하다.

		for (int num1 = 1; num1 < 3; num1++) {
			System.out.println(num1);
		}

		for (int num1 = 5; num1 >= 1; num1--) {
			System.out.println(num1);
		}

		for (int num1 = 1; num1 < 10; num1 += 2) {
			System.out.println(num1);
		}

		int i = 0;
		for (i = 1; i <= 3; i++) {
			System.out.println(i);
		}

		System.out.println("for문 종료 후: " + i);
		// 11번줄이 4가 나오는 이유
		// i가 3일때 i++로 인해 4가되고 i<=3의 조건
		// 때문에 for문은 false로 끝이난다.
		// 끝난 후의 값이 4인것이다.

	}

}