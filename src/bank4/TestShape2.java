package bank4;
abstract class Shape{
	public void draw() {
		System.out.println("Draw a Shape");
	}
	abstract double area();
}

class Circle extends Shape{
	int radius;
	Circle(int r){
		this.radius=r;
	}
	@Override
	public void draw() {
		System.out.println("Draw a Circle");
	}
	 public double area() { 
		 return (Math.PI*radius*radius); 
		 }	
} 
class Rect extends Shape{
	int side1;
	int side2;
	Rect(int l, int b){
		this.side1=l;
		this.side2=b;
	}
	public double area() {
		return (side1*side2);
	}
}

public class TestShape2 {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		c1.draw();
		Rect r1 = new Rect(8,4);
		System.out.println(c1.area());
		System.out.println(r1.area());
	}
}
