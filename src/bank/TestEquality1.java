package bank;

class Rectangle99{
	int length;
	int width;
	Rectangle99(int l, int w){
		this.length=l;
		this.width=w;
	}
}
public class TestEquality1 {
	public static void main(String[] args) {
		Rectangle99 r1=new Rectangle99(7,5);
		Rectangle99 r2=new Rectangle99(7,5);
		System.out.println(r1==r2);     //the 2 objects are different
		System.out.println(r1.equals(r2));
	}
}
