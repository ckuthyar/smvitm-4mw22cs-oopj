package bank;

public class Conversion1 {

	public static void main(String[] args) {
		byte b1, b2;
		int i1=257;
		double d1=323.142;
		
		b1=(byte)i1;
		i1=(int)d1;
		b2=(byte)d1;     //truncation ?
		System.out.println("b1: "+b1);
		System.out.println("i1: "+i1);
		System.out.println("b2: "+b2);

	}

}
