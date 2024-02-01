package bank7;
class BreakdownException extends Exception{
	public BreakdownException(String s1) {
		super(s1);}}
   
class OutOfFuelException extends BreakdownException{
	public OutOfFuelException(String s2) {
		super(s2);}}
class BatteryLowException extends BreakdownException{
	public BatteryLowException(String s3) {
		super(s3);}}
class TyrePunctureException extends BreakdownException{
	public TyrePunctureException(String s4) {
		super(s4);}}

abstract class Vehicle{
	public abstract void run(int km) throws BreakdownException;}
class Car extends Vehicle {
	@Override
	public void run(int km) throws OutOfFuelException,BatteryLowException,TyrePunctureException {
		if(km<=1000) {
			System.out.println("Check fuel"); }
		if(km<=2000) {
			System.out.println("Check battery"); }
		if(km<=5000) {
			System.out.println("Check tyre"); }
	}
}
public class TestException20 {
	public static void main(String[] args) throws OutOfFuelException, BatteryLowException, TyrePunctureException{
		Car myMaruti=new Car();
		myMaruti.run(5000);}}
