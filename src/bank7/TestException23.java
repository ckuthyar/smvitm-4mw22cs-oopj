package bank7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TestException23 {

	public static void main(String[] args)throws FileNotFoundException{
		File f1 =new File("input1.txt");
		Scanner sc1 = new Scanner(f1);
		String info1=sc1.nextLine();
		System.out.println(info1);
		
		int[] even= {2,4,6};
		System.out.println(even[99]);

}
}