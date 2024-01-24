package bank7;
public class TestException17 {
	public static void main(String[] args) {
		int a=10; int b=0;
		int[] vals= {1,2,3};
		try {
			int result=a/b;
			vals[10]=19;}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e1) {
			System.out.println("Exception caught "+e1);}
		System.out.println("After multi-catch ");}}
