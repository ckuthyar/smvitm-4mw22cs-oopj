package bank7;
//throw an exception out of the method
public class TestException11 {
	static void demo1() {
		try {
			System.out.println("Inside demo1() method");
			throw new RuntimeException("demo1");}
		finally {
			System.out.println("finally block");}}
	public static void main(String[] args) {
		demo1();}}
