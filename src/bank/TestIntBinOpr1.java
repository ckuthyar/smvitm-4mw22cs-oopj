package bank;
import java.util.function.*;
public class TestIntBinOpr1 {
		
	public static void main(java.lang.String[]args) {
		IntBinaryOperator opr1=(int a, int b)->{
			System.out.println("This is binary operator");
			return a+b;
		};
		int result=opr1.applyAsInt(3,5);
		System.out.println(result);
	}
}


