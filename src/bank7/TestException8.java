package bank7;
public class TestException8 {
	static void demo1() {
		throw new NullPointerException("demo1");
	}
	public static void main(String[] args) {
		try {
			demo1();}
		catch(NullPointerException npe2) {
			System.out.println("caught "+npe2);}}}


