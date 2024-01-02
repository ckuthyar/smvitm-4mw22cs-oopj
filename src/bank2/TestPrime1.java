package bank2;
//Line 11 needs clarification
import java.util.Scanner;
public class TestPrime1 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=sc1.nextInt();
		sc1.close();
		boolean isPrime=true;
		for(int i=2;i<=num1/2;++i) {
			if(num1%i==0) {
				isPrime=false;break;
				}
			}
		if(isPrime) {
			System.out.println(num1+" is a Prime Number");
		}
		else {
			System.out.println(num1+" not a Prime Number");
		}

	}

}
