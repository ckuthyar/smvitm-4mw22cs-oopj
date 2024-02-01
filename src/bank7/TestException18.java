package bank7;
public class TestException18 {

	public static void main(String[] args) {
		method1();
	}
	public static void method1() {
		Throwable th=new Throwable();
		StackTraceElement[] st=th.getStackTrace();
		for(StackTraceElement element:st) {
			System.out.println(element);
		}
	}

}
