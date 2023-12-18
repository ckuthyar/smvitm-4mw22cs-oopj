package bank2;

@FunctionalInterface
interface Hypo{
	double thirdside(double a,double b);
}
public class Testcalc5 {

	public static void main(String[] args) {
		Hypo hypo=(a,b)->(Math.sqrt((Math.pow(a,2)+Math.pow(b,2))));
		double num1=3,num2=4;
		double res=hypo.thirdside(num1, num2);
		System.out.println(res);
	}

}
