package bank7;
public class TestException5 {
	public static void main(String[] args) {
		int rate;
		int[] amount= {100,200,400,600};
		int[] qty = {1,0,4,6};
		int amt1=0;
		int qt1=0;
		
			for(int i=0;i<5;i++) {
				try {
					amt1=amount[i];
					qt1 = qty[i];
				}
				catch(ArrayIndexOutOfBoundsException aiobe1){
					System.out.println(aiobe1);
				}
				try {
					rate=amt1/qt1;
					System.out.println(amt1+","+qt1+","+rate);
				}
				catch(ArithmeticException ae1) {
					System.out.println(ae1);}
			}
}
}