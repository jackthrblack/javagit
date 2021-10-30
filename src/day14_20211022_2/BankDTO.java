package day14_20211022_2;

public class BankDTO {
	private int clientNumber;
	private String name;
	private String accountNumber;
	private long balance;

	public BankDTO() {
		
	}

	public BankDTO(int clientNumber, String name, String accountNumber, long balance) {
		this.clientNumber = clientNumber;
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankDTO [clientNumber=" + clientNumber + ", name=" + name + ", accountNumber=" + accountNumber
				+ ", balance=" + balance + "]";
	}
	
	
	
	
	
	
}
