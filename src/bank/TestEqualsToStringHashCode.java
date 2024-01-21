package bank;

class Rectangle98{
	public boolean equals(Object o) {
		return true;
	}
	public String toString() {
		return "Hello";
	}
	public int hashCode() {
		return 123;
	}
}
public class TestEqualsToStringHashCode {

	public static void main(String[] args) {
		Rectangle98 r1=new Rectangle98();
		Rectangle98 r2=new Rectangle98();
		System.out.println(r1.equals(r2));
		System.out.println(r1.toString());
		System.out.println(r1.hashCode());
	}
}
