package bank2;
@FunctionalInterface
interface If1{
	int add(int a, int b);
}
public class TestCalc4 {

	public static void main(String[] args) {
		If1 if1=(a,b)->(a+b);

	}

}
