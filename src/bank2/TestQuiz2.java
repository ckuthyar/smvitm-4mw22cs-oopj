package bank2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class TestQuiz2 {

	public static void main(String[] args) throws IOException{
		File f1=new File("Quiz_Capitals.csv");
		Scanner sc1=new Scanner(f1);
		Scanner sc2=new Scanner(System.in);
		String s1="What is the capital of ";
		String s2=" ?";
		int total=0; int marks=10;
		String info1,info2;
		sc1.nextLine();
		
		info1=sc1.nextLine();
		String[] arr1=info1.split(",");
		
		System.out.println(s1+arr1[0]+s2);
		info2=sc2.nextLine();
		if(info2.equals(arr1[1])) {
			total=total+marks;
		}
		
		
		System.out.println(total);
	}

}
