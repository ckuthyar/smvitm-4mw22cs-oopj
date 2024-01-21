package bank;

public interface TestIntBinOpr1 {
	public int applyAsInt(int a, int b);
	TestIntBinOpr1 opr1=(int a, int b)->a+b;
	
	public static void main(String[]args) {
		int result=opr1.applyAsInt(3,5);
		System.out.println(result);
	}
}


