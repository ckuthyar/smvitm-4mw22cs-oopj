package bank7;
public class TestException9 {
	static void demo1() throws IllegalAccessException{
		System.out.println("Inside demo1");
		throw new IllegalAccessException("demo1");    //will not compile
		}
	public static void main(String[] args) throws IllegalAccessException{
		demo1();}}
