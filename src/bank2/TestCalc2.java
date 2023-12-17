package bank2;
@FunctionalInterface
interface IfCalc2{
	int add(int a,int b);
}
public class TestCalc2 {
	public static void main(String[] args) {
		IfCalc2 ifCalc2=(a,b)->(a+b);    //reference of interface
		int num1=8;
		int num2=4;
		int sum=ifCalc2.add(num1,num2);
		System.out.println(sum);
	}

}
