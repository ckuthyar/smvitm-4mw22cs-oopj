package bank7;
public class TestException2 {
	public static void main(String[] args) {
		int amount, quantity, rate;
		try {
			amount=100;
			quantity=0;
			rate=amount/quantity;
			System.out.println(rate);
			System.out.println("This line within try after the exception will not be printed");}
		catch(ArithmeticException ae) {
			System.out.println("Exception - Division by Zero");}
		System.out.println("After catch statement");}}	