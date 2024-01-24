package bank7;
//Returns from within a Try Block
public class TestException12 {
	static void demo1() {
		try {
			System.out.println("Inside demo1() method");
			return;}
		finally {
			System.out.println("finally block");}}
	public static void main(String[] args) {
		demo1();}}
