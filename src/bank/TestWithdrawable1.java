package bank;
interface Withdrawable{
	public boolean withdraw(long amt);
}
class Account implements Withdrawable{
	
}
public class TestWithdrawable1 {

	public static void main(String[] args) {
		Withdrawable w1 = (amt)->(amt-w);
		Withdrawable w2 = new Account();
		Withdrawable w3 = new CurrentAccount();
	}

}
