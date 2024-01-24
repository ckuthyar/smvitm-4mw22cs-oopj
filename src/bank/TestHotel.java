package bank;
class Hotel{
	java.lang.String name;
	public Hotel(java.lang.String n1) {
		this.name=n1;
	}
	public java.lang.String getName() {
		return name;
	}
	public void checkIn(Guest guest) {	
		System.out.println(guest.getName() +"has checked-in");
	}
	public void checkOut(Guest guest) {	
	}
}
class Guest{
	java.lang.String guestname;
	public Guest(java.lang.String g1) {
		this.guestname=g1;
	}
	public java.lang.String getName() {
		return guestname;
	}
}


public class TestHotel {
	public static void main(java.lang.String[] args) {
		Hotel h1=new Hotel("Swagath");
		Guest g1 = new Guest("John");
		h1.checkIn(g1);
	

	}

}
