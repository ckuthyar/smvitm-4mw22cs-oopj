package bank7;
public class TestException8 {
	static void demo1() {
		try {
			throw new NullPointerException("demo1");}
		catch(NullPointerException npe1) {
			System.out.println("Caught inside demo1");
			throw npe1;}}
	public static void main(String[] args) {
		try {
			demo1();}
		catch(NullPointerException npe2) {
			System.out.println("Recaught "+npe2);}}}
