package day14_20211022_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<BankDTO> clientList = new ArrayList<BankDTO>();
		boolean run = true;
		BankService bs = new BankService();
		
		while (run) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("1.고객등록 | 2.전체고객조회 | 3.입금 | 4.출금 | 5.잔액확인 | 6.종료");
			System.out.println("------------------------------------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();

			if (select == 1) {
				clientList = bs.clientJoin(clientList);
			} else if (select == 2) {
				bs.clientListView(clientList);
			} else if (select == 3) {
				clientList = bs.deposit(clientList);
			} else if (select == 4) {
				clientList = bs.withdraw(clientList);
			} else if (select == 5) {
				bs.checkBalance(clientList);
			} else if (select == 6) {
				run = false;
			} else {
				System.out.println("다시 선택해주세요.");
			}

		}
	}

}
