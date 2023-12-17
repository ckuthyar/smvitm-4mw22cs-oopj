package bank;

public class TestGC1 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Hello");
		String s3="Hello";
		String s4=s1.toUpperCase();
		
		s4=s2; //Object associated with s2 is abandoned
		//finalize() method to be run
		//Garbage Collection will be done
		
		System.out.println(s1==s2); //false
		System.out.println(s1==s3); //true
		System.out.println(s4==s2); //true
		System.out.println(s1.equals(s2));//true

	}

}
