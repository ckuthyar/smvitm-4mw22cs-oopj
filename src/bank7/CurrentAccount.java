package bank7;

public class CurrentAccount extends Account{
	private static final long MIN_BAL=1000;
	private static final long PENALTY=100;
	public CurrentAccount(long accountNumber,String name, long openingBalance) {
		super(accountNumber,name,openingBalance);}
	public CurrentAccount(String name, long openingBalance) {
		super(name,openingBalance);}
	@Override
	public boolean withdraw(long amount) {
		if(!super.withdraw(amount)) {
			return false;}
		if(this.getBalance()<MIN_BAL) {
			this.balance=balance-PENALTY;}
		return true;}
	@Override
	public void display() {
		System.out.println(this.getAccountNumber()+this.getName()+this.getBalance());}}
