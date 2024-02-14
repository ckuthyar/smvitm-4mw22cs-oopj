package bank7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class TestFoodItems {

	public static void main(String[] args) throws FileNotFoundException{
		String temp1;
		ArrayList<String> itemname=new ArrayList<>();
		ArrayList<String> itemqty=new ArrayList<>();
		ArrayList<String> itemprice=new ArrayList<>();
		String[] arr1=new String[3];
		File f1=new File("FoodItem.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			temp1=sc1.nextLine();
			arr1=temp1.split(",");
			itemname.add(arr1[0]);
			itemqty.add(arr1[1]);
			itemprice.add(arr1[2]);
			
		}
		System.out.println(itemname);
		System.out.println(itemqty);
		System.out.println(itemprice);
		

	}

}
