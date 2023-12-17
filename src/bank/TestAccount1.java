package bank;
class Account1 {
	    long accNo,balance;
		String name;
		public Account1(long acno, String n, long openBal){
			this.accNo=acno;
			this.name=n;
			this.balance=openBal;}
		public void deposit(long amt) {
			this.balance=balance-amt;}
		public boolean withdraw(long amt) {
			if(this.balance<amt) {
				System.out.println("Insufficient balance");
				return false;}
			else {
				this.balance=balance-amt;
				return true;}}
		public void display() {
			System.out.println(this.accNo+"-"+this.name+"-"+this.balance);}}
public class TestAccount1{
	public static void main(String[] args) {
		Account1 suresh=new Account1(12345,"Suresh",5000);
		suresh.deposit(500);suresh.display();
		suresh.withdraw(2000);suresh.display();
		suresh.withdraw(3000);suresh.display();
	}
}