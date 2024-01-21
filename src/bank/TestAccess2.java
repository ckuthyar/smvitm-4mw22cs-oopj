package bank;
class Access2{
	int n1=1;
	private int n2=2;
	protected int n3=3;
	public int n4=4;
}
public class TestAccess2 {
	public static void main(String[] args) {
		Access2 a2= new Access2();
		System.out.println(a2.n1);
		System.out.println(a2.n2);  //will not compile
		System.out.println(a2.n3);
		System.out.println(a2.n4);
	}
}
