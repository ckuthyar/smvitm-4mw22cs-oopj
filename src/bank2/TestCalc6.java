package bank2;

import java.util.function.DoubleBinaryOperator;

interface Hypo1 extends DoubleBinaryOperator{
	public double calculate(double a, double b);
	public default double applyAsDouble(double a, double b) {
		return calculate(a,b);
	}
}
interface Inverse extends DoubleBinaryOperator{
	public double calculate(double a,double b);
	public default double applyAsDouble(double a, double b) {
		return calculate(a,b);
	}
}

public class TestCalc6 {

	public static void main(String[] args) {
		Hypo1 hypo=(a,b)->(Math.pow((Math.pow(a,2)+Math.pow(b,2)),0.5));
		Inverse inv=(a,b)->((1/a)+(1/b));
		double result1=hypo.calculate(12,5);
		double result2=inv.calculate(12,5);
		System.out.println(result1);
		System.out.println(result2);
	}

}



//DoubleBinaryOperator dbo2=(a,b)->Math.pow((Math.pow(a, 2)+Math.pow(b,2)),0.5);
//DoubleBinaryOperator dbo1=(a,b)->1/((1/a)+(1/b));