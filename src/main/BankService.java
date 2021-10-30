package main;

import java.util.*;

public class BankService {

	Scanner in = new Scanner(System.in);

	List<BankDTO> clientJoin(List<BankDTO> bkList) {

		System.out.print("이름:");
		String name = in.next();
		System.out.print("계좌번호:");
		String clientAccount = in.next();

		int balance = 0;

		int clientNum = 0;
		clientNum = bkList.size() + 1;

		BankDTO mem = new BankDTO(name, clientAccount, balance, clientNum);
		bkList.add(mem);
		return bkList;
	}

	void clientListView(List<BankDTO> bkList) {

		for (BankDTO m : bkList) {
			System.out.println(m);
		}
	}

	int loginCheck(List<BankDTO> bkList) {
		System.out.print("이름:");
		String name = in.next();
		System.out.print("계좌번호");
		String clientAccount = in.next();

		int num = -1;
		for (int i = 0; i < bkList.size(); i++) {
			if (bkList.get(i).getName().equals(name) && bkList.get(i).getClinetAccount().equals(clientAccount)) {
				num = i;
			}
			else {
				System.out.println("일치하는 정보가 없습니다.");
			}
		}

		return num;
	}

	List<BankDTO> deposit(List<BankDTO> bkList) {

		int result = loginCheck(bkList);
		if (result >= 0) {
			System.out.print("입금액:");
			int deposit = in.nextInt();
			int balance = bkList.get(result).getBalance() + deposit;
			bkList.get(result).setBalance(balance);
		} //else {
			//System.out.println("일치하는 정보가 없습니다.");
		//}
		return bkList;
	}

	List<BankDTO> withdraw(List<BankDTO> bkList) {

		int result = loginCheck(bkList);
		System.out.print("출금액:");
		int withdraw = in.nextInt();
		int balance = bkList.get(result).getBalance();
		if (withdraw < balance) {
			balance = balance - withdraw;
			bkList.get(result).setBalance(balance);
		} //else {
			//System.out.println("일치하는 정보가 없습니다.");
		//}

		return bkList;
	}

	void checkBalance(List<BankDTO> bkList) {
		int result = loginCheck(bkList);
		if (result >= 0) {
			System.out.println(bkList.get(result).getBalance());
		}
	}

}
