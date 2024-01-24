package bank7;
public class TestException10{
	static void demo1() throws IllegalAccessException{
		System.out.println("Inside demo1() method");
		throw new IllegalAccessException("demo1");}
	public static void main(String[] args) {
		try {
			demo1();}
		catch(IllegalAccessException iae1) {
			System.out.print("Inside catch block ");
			System.out.println(iae1);}}}
