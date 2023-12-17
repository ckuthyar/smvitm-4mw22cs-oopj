package bank2;
import java.lang.Math;
@FunctionalInterface
interface IfCalc3{
	double hypo(int a, int b);//method type is declared, no implementation
}   
@FunctionalInterface
interface IfInverse{
	double inverse(double a, double b);
}
public class TestCalc3 {
	public static void main(String[] args) {
		IfCalc3 ifHypo=(a,b)->Math.pow((Math.pow(a, 2)+Math.pow(b,2)),0.5);
		IfInverse ifInverse=(a,b)->1/((1/a)+(1/b));
		int num1=6;
		int num2=8;
		double hyp=ifHypo.hypo(num1, num2);
		double inv=ifInverse.inverse(num1,num2);
		System.out.println("Length of hypotenuse is "+hyp);
		System.out.println("Inverse is "+inv);
	}
}
