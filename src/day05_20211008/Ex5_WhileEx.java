package day05_20211008;

public class Ex5_WhileEx {

	public static void main(String[] args) {
		// 주사위(1~6)
		// 계속 던져서 6나오면 종료

		int num = 0;
		while (true) {
			num = (int) (Math.random() * 6) + 1;

			if (num == 6) {
				System.out.println("숫자: " +num);
				break;
			}else if(num!=6) {
				System.out.println("숫자: " + num);
			}			
		}
	}// 알게된 내용: Math.random()의 값을 변수에 넣을 수 있다.
}