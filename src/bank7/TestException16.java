package bank7;
public class TestException16 {
	static void demo1() {
		NullPointerException npe1=new NullPointerException("top layer");
		npe1.initCause(new ArithmeticException("cause"));
		throw npe1;}
	public static void main(String[] args) {
		try {
			demo1();}
		catch(NullPointerException npe2) {
			System.out.println("caught "+npe2);
			System.out.println("Original cause "+npe2.getCause());}}}
