package bank7;
public class TestException4 {
	public static void main(String[] args) {
		int amount, quantity, rate;
		try {
			amount=100;
			quantity=0;
			rate=amount/quantity;
			System.out.println("Rate is "+rate);}
		catch(ArithmeticException ae1) {
			System.out.println(ae1);}}}	