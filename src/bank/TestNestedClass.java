package bank;
class Outer{
	void display() {
		System.out.println("Outer Class display method");}
	class Inner{
		void display() {
			System.out.println("Inner Class display method");}}}
public class TestNestedClass {
	public static void main(String[] args) {
		Outer o1=new Outer();
		o1.display();
		Outer.Inner i1=o1.new Inner();
		i1.display();
	}
}
