package day14_20211022_2;

import java.util.*;

public class BankService {

		/*
		 * 메서드 이름:clienJoin
		 * 리턴타입 : List<BankDTO>
		 * 매개변수 : clientList
		 */
	public List<BankDTO> clientJoin(List<BankDTO> clientList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("고객명: ");
		String name = scan.next();
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();
		int number = clientList.size() + 1;

		BankDTO member = new BankDTO(number, name, accountNumber, 0);

		clientList.add(member);
		return clientList;
	}

	public void clientListView(List<BankDTO> clientList) {
		for (BankDTO b : clientList) {
			System.out.println(b);
		}
	}

	public List<BankDTO> deposit(List<BankDTO> clientList) {
		Scanner scan = new Scanner(System.in);
		int checkResult = clientCheck(clientList);
		if (checkResult >= 0) {
			System.out.print("입금액: ");
			long deposit = scan.nextInt();
			long balance = clientList.get(checkResult).getBalance() + deposit;
			clientList.get(checkResult).setBalance(balance);
			System.out.println("입금완료. 잔액은 " + balance + "원 입니다.");
		} else {
			System.out.println("일치하는 정보가 없습니다.");
		}
		return clientList;
	}

	public List<BankDTO> withdraw(List<BankDTO> clientList) {
		Scanner scan = new Scanner(System.in);
		int checkResult = clientCheck(clientList);
		if (checkResult >= 0) {
			System.out.print("출금액: ");
			long withdraw = scan.nextInt();
			long balance = clientList.get(checkResult).getBalance();
			if (withdraw < balance) {
				balance = balance - withdraw;
				clientList.get(checkResult).setBalance(balance);
				System.out.println("출금완료 잔액은 " + balance + "원 입니다.");
			} else {
				System.out.println("잔고부족");
			}
		} else {
			System.out.println("일치하는 정보가 없습니다.");
		}
		return clientList;
	}

	public void checkBalance(List<BankDTO> clientList) {
		int checkResult = clientCheck(clientList);
		if (checkResult >= 0) {
			long balance = clientList.get(checkResult).getBalance();
			System.out.println("잔액은 " + balance + "원 입니다.");
		} else {
			System.out.println("일치하는 정보가 없습니다.");
		}
	}

	public int clientCheck(List<BankDTO> clientList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("고객명: ");
		String name = scan.next();
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();

		int clientNumber = -1;

		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())
					&&name.equals(clientList.get(i).getName())) {
				clientNumber = i;
			}
		}
		return clientNumber;
	}
	
}
