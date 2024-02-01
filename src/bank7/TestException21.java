package bank7;
class NegativeAmountException extends Exception{
	public NegativeAmountException(String s1) {
		super(s1);}}
class AccountSB2{
	int balance;
	public AccountSB2(int openingBal) {
		this.balance=openingBal;}
	public void deposit(int amt) throws NegativeAmountException{
		if (amt<0) {
			throw new NegativeAmountException("amt incorrect");}
		this.balance=balance-amt;}}
public class TestException21 {
	public static void main(String[] args) throws NegativeAmountException {
		AccountSB2 ac1 = new AccountSB2(5000) ;
		ac1.deposit(-2000);	}}
