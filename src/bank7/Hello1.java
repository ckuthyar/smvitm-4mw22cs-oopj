package bank7;

interface HelloInterface{
	public static void main(String[]args) {
		System.out.println("This is Interface");}}

enum HelloEnum{
	HI,HELLO;
	public static void main(String[]args) {
		System.out.println("This is enum");}}

//not supported in Java 1.8 
record HelloRecord() {
	
}
class HelloWorld {
	public static void main(String[]args) {
		HelloWorld hw1,hw2;
		hw1=new HelloWorld();
		HelloWorld hw3=new HelloWorld();
		HelloInterface hi1;
		HelloEnum he1;
		HelloRecord hr1;
	}
	

}
