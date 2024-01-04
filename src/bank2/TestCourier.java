package bank2;
class AnyBox{
	int length;
	int width;
	int height;
	static final double rateV=3.5;
	AnyBox(int l, int w, int h){
		this.length=l;
		this.width=w;
		this.height=h;
	}
	double getPrice() {
		double volume = length*width*height;
		return volume*rateV;
	}
}
class AnyHeavyBox extends AnyBox{          //use of inheritance. Parent class, Child class
	double weight;
	static final double rateW=6;
	AnyHeavyBox(int l, int w, int h, double wt) {
		super(l, w, h);   
		this.weight=wt; //super keyword
	}
	double getPrice2() {
		return getPrice()*weight*rateW;         //getPrice() methodOverloading
	}
}
public class TestCourier {
	public static void main(String[] args) {
		System.out.println("Any Couriers - Inland Shipping Rate from Udupi to Bangalore");
		AnyBox box1 = new AnyBox(3,3,2);
		AnyBox box2 = new AnyBox(12,8,1);
		AnyHeavyBox box3 = new AnyHeavyBox(4,2,1, 4);
		double amt1=box1.getPrice();
		double amt2=box2.getPrice();
		double amt3= box3.getPrice2();
		System.out.println("box1 - "+"Rs " +amt1); //chalkpiece box - light weight
		System.out.println("box2 - "+"Rs " +amt2); //keyboard box - light weight
		System.out.println("box3 - "+"Rs " +amt3); //Java Complete Reference book - very heavy
	}
}

























