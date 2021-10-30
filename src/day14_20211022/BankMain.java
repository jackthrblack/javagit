package day14_20211022;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {

		List<BankDTO> bkList = new ArrayList<>();

		BankService bks = new BankService();

		boolean run = true;

		Scanner in = new Scanner(System.in);
		while (run) {

			System.out.print("메뉴 선택: ");
			int menu = in.nextInt();

			switch (menu) {

			case 1: // 등록
				bkList = bks.clientJoin(bkList);
				break;
			case 2: // 조회
				bks.clientListView(bkList);
				break;
			case 3: // 입금
				bks.deposit(bkList);
				break;
			case 4: // 출금000
				bks.withdraw(bkList);
				break;
			case 5: //잔액확인
				bks.checkBalance(bkList);
				break;	

			}
		}
	}

}
