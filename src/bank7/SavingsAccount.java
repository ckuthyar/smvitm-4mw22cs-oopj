package bank7;

public class SavingsAccount extends Account {
	public SavingsAccount(long accountNumber, String name, long openingBalance) {
		super(accountNumber, name, openingBalance);}
	public SavingsAccount(String name, long openingBalance) {
		super(name,openingBalance);
	}
	@Override
	public void display(){
		System.out.println(this.getAccountNumber()+this.getName()+this.getBalance());}}
