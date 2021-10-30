package main;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		List<BankDTO> bkList = new ArrayList<>();

		boolean run = true;
		
		BankService bk = new BankService();

		while (run) {
			
			System.out.print("메뉴선택:");
			int menu = in.nextInt();

			switch (menu) {

			case 1: // 고객등록
				bkList=bk.clientJoin(bkList);
				break;
			case 2: // 고객조회
				bk.clientListView(bkList);
				break;
			case 3: // 입금
				bkList=bk.deposit(bkList);
				break;
			case 4: // 출금
				bkList=bk.withdraw(bkList);
				break;
			case 5: // 잔액확인
				bk.checkBalance(bkList);
				break;
			case 6: // 종료
				run = false;
				break;

			}

		}

	}

}
