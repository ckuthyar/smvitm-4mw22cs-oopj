package bank7;

public class Account {
	private static long lastAccountNumber=12345678;
	private long accountNumber;
	private String name;
	long balance;
	
	public long getAccountNumber(){
		return accountNumber;}
	public Account(long AccountNumber, String name, long openingBalance) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=openingBalance;}
	public Account(String name, long openingBalance) {
		this(++lastAccountNumber, name, openingBalance);}
	public String getName() {
		return name;}
	public long getBalance() {
		return balance;}
	public void deposit(long amount) {
		this.balance=balance+amount;}
	public boolean withdraw(long amount) {
		if(this.getBalance()<amount) {
			System.out.println("Withdrawal failed");
			return false;}
		this.balance=balance-amount;
		return true;}
	public void display() {
		System.out.println(this.accountNumber+this.name+this.balance);}
}
