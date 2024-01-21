package bank;
class Alpha{
	Alpha method1() {
		Alpha a1=new Alpha();
		return a1;
	}
}
public class TestReturn {
	public static void main(String[] args) {
		Alpha a2=new Alpha();
		Alpha a3=a2.method1();
		System.out.println("Done");
	}
}
