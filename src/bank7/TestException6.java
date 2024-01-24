package bank7;
public class TestException6 {
	public static void main(String[] args) {
		int rate;
		int[] amount= {100,200,400,600};
		int[] qty= {1,0,4,6};
		try {
			for(int i=0;i<5;i++) {
				rate=amount[i]/qty[i];
				System.out.println(amount[i]+","+qty[i]+","+rate);}}
		catch(Exception e1) {
			System.out.println(e1);}
		catch(ArithmeticException ae1) {    //unreachable block
			System.out.println(ae1);}}}



