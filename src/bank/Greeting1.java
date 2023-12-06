package bank;

public class Greeting1 {
	public static String greeting() {
		return "Hello Guest";
	}
	public static String greeting(String name) {
		return "Hello "+name;
	}

	public static void main(String[] args) {
		System.out.println(greeting());
		System.out.println(greeting("Kuthyar"));
		

	}

}
