package in.sode.cs;
import in.sode.cs.HumanBeing;
import in.sode.cs.Student;

public class K1 {

	public static void main(String[] args) {
		Student ashok=new Student();
		Student balu = new Student();
		
		ashok.name="Ashok Kumar ";
		ashok.city="Bangalore";
		ashok.canCodePython=true;
		ashok.canCodeJava=false;
		
		balu.name ="Balakrishna";
		balu.city="Udupi";
		ashok.canCodePython=true;
		ashok.canCodeJava=false;
		
		Student.canCode("Ashok Kumar");
		
		
		
		
	}

}
