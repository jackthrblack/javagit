package day07_20211013;

import java.util.Scanner;

public class Ex1_BankEx {

	public static void main(String[] args) {
		// 1.예금 | 2.출금 | 3.잔고 | 4.종료
		// 선택>
		// 초기 잔고 0

		Scanner scan = new Scanner(System.in);
		int num1 = 0; // 메뉴선택
		int num2 = 0; // 현재잔액

		boolean run = true;

		do {
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4종료");
			System.out.print("선택> ");

			num1 = scan.nextInt();

			if (num1 == 1) {
				System.out.print("예금액>");
				int num3 = scan.nextInt(); // 예금액
				num2 = num3;
				System.out.println("현재잔액은 " + num3 + "입니다.");
			}
			else if (num1 == 2) {
				System.out.print("출금액>");
				int num4 = scan.nextInt(); // 출금액
				if (num4 > num2) {
					System.out.println("잔고가 부족합니다.");
					System.out.println("현재잔액은 " + num2 + "입니다.");
				} else {
					num2 = num2 - num4;
					System.out.println("현재잔액은 " + num2 + "입니다.");
				}
			} else if (num1 == 3) {
				System.out.println("현재잔액은 " + num2 + "입니다.");
			} else if (num1 == 4) {
				run = false;
			}
		} while (run);
	
	
//	switch(select) {
//	case 1:
//		//예금
//		break;
//	case 2:
//		//출금
//		break;
//	case 3:
//		//잔고
//		break;
//	case 4:
//		//종료
//		break;
//	}
	
	
	
	
	}

}

//헤맨 이유
//1. 출금을 할 때 출금하는 금액이 잔고보다 많을때의 값이 -값이 나왔다.
//2. if안에 if를 써서 해봤는데 -값과 원래값이 같이 나왔다.
//3. else를 너무 늦게 생각했다.