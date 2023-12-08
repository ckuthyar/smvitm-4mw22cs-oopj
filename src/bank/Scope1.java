package bank;

public class Scope1 {

	public static void main(String[] args) {
		int x;
		x=10;
		if(x==10) {
			int y=20;
			x=y*2;
			System.out.println("x is: "+x);
			System.out.println("y is: "+y);
		}
		//y=100;    //Error! y not known here
		//x is still known here
	}

}
