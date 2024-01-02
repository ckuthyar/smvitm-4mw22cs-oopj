package bank2;
public class Prime1 {
	public static void main(String[] args) {
		boolean isPrime=true;
		for(int num1=0;num1<100;num1++) {
			isPrime=true;
			for(int i=2;i<num1-1;i++) {
				if(num1%i==0) {
					isPrime=false;
					break;
				}else {
					continue;
				}
			}
			if(isPrime==true) {
				System.out.println(num1 + " may be a prime");
			}else {
				//System.out.println(num1+" number is not a prime");
			}
		}				
	}		
}
			



