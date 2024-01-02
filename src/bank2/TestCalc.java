package bank2;
public class TestCalc {
	public static void calc1(int n1,int n2) {
		int num1=n1;
		int num2=n2;
		int sum1=num1+num2;
		int dif1=num1-num2;
		int prod1=num1*num2;
		double div1=num1/num2;
		System.out.println(sum1+" "+dif1+" "+prod1+" "+div1);
	}
	public static void main(String[] args) {
		calc1(8,4);
		calc1(10,20);
	}
}
