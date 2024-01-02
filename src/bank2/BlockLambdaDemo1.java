package bank2;
@FunctionalInterface
interface NumericFunc{
	int func(int n);
}
public class BlockLambdaDemo1 {

	public static void main(String[] args) {
		NumericFunc factorial=(n)->{
			int result=1;
			for(int i=1;i<=n;i++) {
				result=i*result;
			}
			return result;
		};
		System.out.println("Factorial of 3 is "+factorial.func(3));
		System.out.println("Factorial of 5 is "+factorial.func(5));
		
		
				
		}
	

	}


