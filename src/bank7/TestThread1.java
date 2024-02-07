package bank7;
class Hi{
	public void show() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");}}	}
class Hello{
	public void show() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");}}}
public class TestThread1 {
	public static void main(String[] args) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		obj1.show();
		obj2.show();}}
