package bank;

public class Greeting1 {
	public static String greeting() {
		return "Hello Guest";
	}
	public static String greeting(String name) {
		return "Hello "+name;
	}
	public static String greeting(String name, String gender) {
		String prefix=". ";
		if(gender=="M") {
			prefix="Mr";
		}
		if(gender=="F") {
			prefix="Ms";
		}
		return "Hello "+prefix+ " "+name;
	}

	public static void main(String[] args) {
		System.out.println(greeting());
		System.out.println(greeting("Kuthyar"));
		System.out.println(greeting("Aditya","M"));
		System.out.println(greeting("Asha","F"));
		
		

	}

}
