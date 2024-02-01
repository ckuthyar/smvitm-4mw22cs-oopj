package bank7;
public class TestException19 {
	public static void main(String[] args) {
		System.out.println("Line1");
		try {
			System.out.println("Line2");
			System.out.println("Line3");
		}catch(ArithmeticException a1) {
			System.out.println("Line4");
			System.out.println("Line5");
		}catch(ArrayIndexOutOfBoundsException ae1) {
			System.out.println("Line6");
			System.out.println("Line7");
		}finally {
			System.out.println("Line8");
			System.out.println("Line9");}
		System.out.println("Line10");}}
