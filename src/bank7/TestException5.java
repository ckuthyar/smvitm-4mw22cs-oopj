package bank7;
public class TestException5 {
	public static void main(String[] args) {
		int rate;
		int[] amount= {100,200,400,600};
		int[] qty = {1,0,4,6};
		try {
			for(int i=0;i<5;i++) {
				rate=amount[i]/qty[i];
				System.out.println(amount[i] +","+qty[i]+","+rate);}}
		catch(ArithmeticException ae1) {
			System.out.println(ae1);}
		catch(IndexOutOfBoundsException iobe1) {
			System.out.println(iobe1);}}}
