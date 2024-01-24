package bank7;
//demonstrate finally
public class TestException14 {
	static void demo1() {
		try {
			System.out.println("Inside demo1() method");
			throw new RuntimeException("demo1");}
		finally {
			System.out.println("finally block");}}
	static void demo2() {
		try {
			System.out.println("Inside demo2() method");
			return;}
		finally {
			System.out.println("finally block");}}
	static void demo3(){
		try {
			System.out.println("Inside demo3() method");}
		finally {
			System.out.println("finally block");}}
	public static void main(String[] args) {
		try {
			demo1();}
		catch(Exception e1) {
			System.out.println("Exception caught");}
		demo2();
		demo3();}}