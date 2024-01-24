package bank7;
import java.util.Random;
public class TestException3 {
	public static void main(String[] args) {
		int a=0;int b=0;int c=0;
		Random rand=new Random();
		for (int i=0;i<10;i++) {
			try{
				b=rand.nextInt();
				c=rand.nextInt();
				a=12345/(b/c);}
			catch(ArithmeticException ae1){
				System.out.println(a+ " , "+i+" Division by zero");
				a=5555;}
			//System.out.println(a);
			}}}
