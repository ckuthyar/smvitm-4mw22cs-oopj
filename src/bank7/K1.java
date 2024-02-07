package bank7;

public class K1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<10; i++) {
			System.out.println(i*i+"\t") ;
		}
		int p=100000;
		int t=3;
		int r=8;
		double si=p*t*r/100;
		double amt=p+si;
		double emi=amt/(t*12);
		System.out.println(emi);
		int num1=3;
		String info1;
		for(int i=1;i<11;i++) {
			info1=num1+"*"+i+"="+num1*i;
			System.out.println(info1);
		}
	

	}

}
