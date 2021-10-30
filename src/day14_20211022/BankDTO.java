package day14_20211022;

public class BankDTO {

	private int clinetNum;
	private String name;
	private String account;
	private int balance;
	
	BankDTO(){
		
	}

	public BankDTO(int clinetNum, String name, String account, int balance) {
		this.clinetNum = clinetNum;
		this.name = name;
		this.account = account;
		this.balance = balance;
	}

	public int getClinetNum() {
		return clinetNum;
	}

	public void setClinetNum(int clinetNum) {
		this.clinetNum = clinetNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankDTO [clinetNum=" + clinetNum + ", name=" + name + ", account=" + account + ", balance=" + balance
				+ "]";
	}

	
	
	
	
	
}
