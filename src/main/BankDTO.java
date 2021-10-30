package main;

public class BankDTO {

	String name;
	String clinetAccount;
	int balance;
	int clientNum;
	
	
	BankDTO(){
		
	}


	public BankDTO(String name, String clinetAccount, int balance, int clientNum) {
		this.name = name;
		this.clinetAccount = clinetAccount;
		this.balance = balance;
		this.clientNum = clientNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getClinetAccount() {
		return clinetAccount;
	}


	public void setClinetAccount(String clinetAccount) {
		this.clinetAccount = clinetAccount;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public int getClientNum() {
		return clientNum;
	}


	public void setClientNum(int clientNum) {
		this.clientNum = clientNum;
	}


	@Override
	public String toString() {
		return "BankDTO [name=" + name + ", clinetAccount=" + clinetAccount + ", balance=" + balance + ", clientNum="
				+ clientNum + "]";
	}
	
	
	
}
