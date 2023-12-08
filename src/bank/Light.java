package bank;
//@Kuthyar
//Compute distance traveled by light in 1000 days
public class Light {

	public static void main(String[] args) {
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		lightspeed=186000;
		days=1000;
		seconds=days*24*60*60;
		distance=lightspeed*seconds;
		System.out.println("Light travels "+distance+" miles in "+days+" days");
	}

}
