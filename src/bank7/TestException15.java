package bank7;
class MyException extends Exception{
	private int detail;
	MyException(int a){
		this.detail=a;}
	public String toString() {
		return "MyException "+detail;}}

public class TestException15 {
	static void compute(int a)throws MyException{
		System.out.println("called compute "+ a);
		if(a>10) {
			throw new MyException(a);}
		System.out.println("Normal Exit");}
	public static void main(String[] args) {
		try {
			compute(1);
			compute(20);}
		catch(MyException me1) {
			System.out.println("Caught "+me1);}}}
