package day14_20211022;

import java.util.*;

public class BankService {

	Scanner in = new Scanner(System.in);

	List<BankDTO> clientJoin(List<BankDTO> bkList) {

		System.out.print("이름:");
		String name = in.next();
		System.out.print("계좌번호:");
		String account = in.next();

		int balance = 0;

		int clientNum = bkList.size() + 1;

		BankDTO mem = new BankDTO(clientNum, name, account, balance);

		bkList.add(mem);
		return bkList;
	}

	void clientListView(List<BankDTO> bkList) {
		for (int i = 0; i < bkList.size(); i++) {
			System.out.println(bkList.get(i).toString());
		}
//		for(BankDTO m : bkList) {
//			System.out.println(m);
//		}	
	}

	void deposit(List<BankDTO> bkList) {
		System.out.print("이름:");
		String name = in.next();
		System.out.print("계좌:");
		String account = in.next();
		boolean a = false;
		int b = 0;
		for (int i = 0; i < bkList.size(); i++) {
			if (bkList.get(i).getName().equals(name) && bkList.get(i).getAccount().equals(account)) {
				a = true;
				b = i;
			}
		}
		if (a) {
			System.out.print("입금금액:");
			int deposit = in.nextInt();
			bkList.get(b).setBalance(deposit);
		} else {
			System.out.println("정보가 틀립니다.");
		}
	}

	void withdraw(List<BankDTO> bkList) {
		System.out.print("이름:" );
		String name = in.next();
		System.out.print("계좌:");
		String account = in.next();
		boolean a = false;
		int b = 0;
		for (int i = 0; i < bkList.size(); i++) {
			if (bkList.get(i).getName().equals(name) && bkList.get(i).getAccount().equals(account)) {
				a = true;
				b = i;
			}
		}
		System.out.print("출금금액:");
		int withdraw = in.nextInt();
		if (bkList.get(b).getBalance() < withdraw) {
			System.out.println("잔액부족");
		}else if (a) {
			bkList.get(b).setBalance(bkList.get(b).getBalance() - withdraw);
			// 괄호 안을 먼저보면 저장된 Balance에서 출금 금액을 빼기 위해서 bkList를 다시하고
			// 그 값을 저장하기 위해 다시 bkList를 쓴다.
		} else {

			                                         
		}

	}

	void checkBalance(List<BankDTO> bkList) {
		System.out.print("이름:");
		String name = in.next();
		System.out.print("계좌:");
		String account = in.next();
		boolean a = false;
		int b = 0;
		for (int i = 0; i < bkList.size(); i++) {
			if (bkList.get(i).getName().equals(name) && bkList.get(i).getAccount().equals(account)) {
				a = true;
				b = i;
			}
		}
		if (a) {
			System.out.println(bkList.get(b).getBalance());
		}
		
	}
	
	
	
	
	
	}
