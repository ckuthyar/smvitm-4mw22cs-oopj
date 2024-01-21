package bank3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class TestDuration1 {

	public static void main(String[] args) {
		//DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate today1=LocalDate.now();
		LocalDate today2=LocalDate.of(1947,8,15);
		
		System.out.println(today1);
		System.out.println(today2);

	}

}
