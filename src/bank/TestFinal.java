package bank;
class A{
	final void getData() {
		System.out.println("This method is declared final");
	}
}
class B extends A{
	void getData() {   //cannot override
		System.out.println("This is illegal");
	}
}
public class TestFinal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
