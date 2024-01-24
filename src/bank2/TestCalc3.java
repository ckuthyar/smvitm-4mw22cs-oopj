package bank2;
import java.lang.Math;

import java.util.function.DoubleBinaryOperator;


public class TestCalc3 {
	public static void main(String[] args) {
		DoubleBinaryOperator dbo2=(a,b)->Math.pow((Math.pow(a, 2)+Math.pow(b,2)),0.5);
		DoubleBinaryOperator dbo1=(a,b)->1/((1/a)+(1/b));
		int num1=6;
		int num2=8;
		double hyp=dbo2.applyAsDouble(num1, num2);
		double inv=dbo1.applyAsDouble(num1,num2);
		System.out.println("Length of hypotenuse is "+hyp);
		System.out.println("Inverse is "+inv);
	}
}



