package bank7;
class BreakdownException extends Exception{
	public BreakdownException(String s1) {
		super(s1);
	}
}
class OutOfFuelException extends BreakdownException{
	public OutOfFuelException(String s2) {
		super(s2);
	}
}
class BatteryLowException extends BreakdownException{
	public BattteryLowException(String s3) {
		super(s3);
	}	
}
class TyrePunctureException extends BreakdownException{
	public TyrePunctureException(String s4) {
		super(s4);
	}
}
abstract class Vehicle{
	public abstract void run(int km) throws BreakdownException; 
}
class Car extends Vehicle{ 
	public void run(int km) throws
	OutOfFuelException,BatteryLowException,TyrePunctureException{
		if(km<=1000) {
			System.out.println("Check fuel");
		}
		if(km<=2000) {
			System.out.println("Check battery");
	}
		if(km<=5000) {
		System.out.println("Check tyre");
}
		else {
			System.out.println("Take to maruthi workshop for servicing");
		}	
		}}
public class TestException22 {
public static void main (String[] args)throws OutOfFuelException,BatteryLowException,TyrePunctureException{
	Car myMaruthi=new Car();
	myMaruthi.run(8000);
}
}
}