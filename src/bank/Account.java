package bank;

public class Account {
	private long accountNumber;
	private String name;
	long balance;
	
	public Account(long acno, String n, long openBal) {
		this.accountNumber=acno;
		this.name=n;
		this.balance=openBal;
	}
	public long getAccountNumber() {
		return this.accountNumber;
	}
	public String getName() {
		return this.name;
	}
	public long getBalance() {
		return this.balance;
	}
	public void deposit(long amt) {
		this.balance=balance-amt;
		
	}
	public boolean withdraw(long amt) {
		if(this.balance<amt) {
			return false;
		}
		this.balance=balance-amt;
		return true;
	}
	public void display() {
		System.out.println(this.accountNumber+","+this.name+","+this.balance);
	}
	private static long lastAccountNumber=1000;
	
	public Account(String n, long openBal){
		this(++lastAccountNumber, n, openBal);
		}
}


