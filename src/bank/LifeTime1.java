package bank;
//@Kuthyar 08-Dec-2023
public class LifeTime1 {

	public static void main(String[] args) {
		int x;
		for(x=0;x<3;x++) {
			int y=-1; //y is initialised each time block is entered
			System.out.println("y: "+y);
			y=100;
			System.out.println("y: "+y);
		}

	}

}
