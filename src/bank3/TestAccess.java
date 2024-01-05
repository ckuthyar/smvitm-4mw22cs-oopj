package bank3;
class CSDept{
	public String lab1="lab1";
	public String lab2="lab2";
	private String getLab1() {
		return lab1;}
	public String getLab2() {
		return lab2;}
	String booklab(String labname,String subject) {
		String msg1=labname+" booked for"+subject;
		return msg1;}}
class Codetrooper extends CSDept{
	public String event1;
	String booklab(String labname,String subject,String event) {
		String msg2=labname+" booked for"+subject+"for"+event;
		return msg2;}}

public class TestAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSDept cs1=new CSDept();
		Codetrooper cc1=new Codetrooper();
		String result1=cs1.booklab(cs1.getLab2()," Python");
		String result2=cc1.booklab(cc1.getLab2()," Robotics", "Hackathon\n");
		System.out.println(result1);System.out.println( result2);
		String result3=cs1.booklab(cs1.getLab1(), " Java");
		String result4=cc1.booklab(cc1.getLab1()," Drone","Hackathon\n");
		System.out.println(result3);System.out.println(result4);
		
		

	}

}
