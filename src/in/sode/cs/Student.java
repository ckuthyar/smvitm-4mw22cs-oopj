package in.sode.cs;
import java.util.List;
import java.util.ArrayList;


public class Student extends HumanBeing{
	static boolean canCodePython;
	static boolean canCodeJava;
	
	public static List<String> canCode(String name1){
		List<String> list1 = new ArrayList<>();
		if(canCodePython) {
			list1.add("Python");
		}
		else if(canCodeJava) {
			list1.add("Java");
		}
		else {
			System.out.print("");
		}
		return list1;
	}
	

}
