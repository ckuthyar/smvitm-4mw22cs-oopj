package bank;
import java.util.Scanner;
public class Ternary2 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your age in years");
		int age=sc1.nextInt();
		String s1="You are eligible to vote";
		String s2="You are not eligible to vote";
		String eligible="";
		
		eligible=age>=18?s1:s2;
		System.out.println(eligible);
	}

}
