package bank;
class Box{
	double width,height,depth;
	Box(double w, double h, double d){
		this.width=w;
		this.height=h;
		this.depth=d;}
	Box(double len){
		this(len,len,len);}
	Box(Box b){
		this(b.width,b.height,b.depth);}
	double volume() {
		return width*height*depth;}
}
public class TestBox {
	public static void main(String[] args) {
		Box b1=new Box(3,4,5); 
		Box b2=new Box(4);
		double v1=b1.volume(); 
		double v2=b2.volume();
		System.out.println(v2);
		String s1="Box b1 is bigger";
		String s2="Box b2 is bigger";
		String s3="Box b1 and b2 are having same volume";
		if(v1>v2) { 
			System.out.println(s1);}
		else if(v2>v1) {
			System.out.println(s2);}
		else{
			System.out.println(s3);}
		}
	}


