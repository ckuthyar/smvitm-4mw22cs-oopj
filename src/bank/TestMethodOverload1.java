package bank;
class MethodOverload1{
	void test(){
		System.out.println("No params");
	}
	void test(int a) {
		System.out.println(a*a);
	}
	void test(int a, int b) {
		System.out.println(a+b);
	}
	double test(double a) {
		return a*a;
	}
}

public class TestMethodOverload1 {
	

	public static void main(String[] args) {
		MethodOverload1 mo1=new MethodOverload1();
		double result;
		
		mo1.test();
		mo1.test(10);
		mo1.test(10,20);
		result=mo1.test(123.25);
		System.out.println(result);
		

	}

}
