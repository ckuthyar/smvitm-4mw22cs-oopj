package bank3;
import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
public class TestTimeZone {

	public static void main(String[] args) {
		String[] cities= {"Asia/Kolkata","Europe/London"};
		ArrayList<String> list1=new ArrayList<>();
		for(int i=0;i<2;i++) {
			LocalTime currentTime = LocalTime.now(Clock.system(ZoneId.of(cities[i])));
			list1.add(cities[i]+":"+currentTime);
		}
		System.out.println(list1);
	}
}
