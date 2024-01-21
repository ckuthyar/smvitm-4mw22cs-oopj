package bank;
class Hotel{
	String name;
	public Hotel(String n1) {
		this.name=n1;
	}
	public String getName() {
		return name;
	}
	public void checkIn(Guest guest) {	
		System.out.println(guest.getName() +"has checked-in");
	}
	public void checkOut(Guest guest) {	
	}
class Guest{
	String guestname;
	public Guest(String g1) {
		this.guestname=g1;
	}
	public String getName() {
		return guestname;
	}
}

}
public class TestHotel {
	public static void main(String[] args) {
		Hotel h1=new Hotel("Swagath");
		h1.

	}

}
