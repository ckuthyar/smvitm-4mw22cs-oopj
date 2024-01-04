package bank2;
abstract class Figure{
	double dimen1;
	double dimen2;
	Figure(double a, double b){
		this.dimen1=a;
		this.dimen2=b;
	}
	abstract double calcArea();
}
class Rectangle extends Figure{
	Rectangle(double a, double b) {
		super(a, b);
	}
	double calcArea() {
		return dimen1*dimen2;
	}
}
class Triangle extends Figure{
	Triangle(double a, double b) {
		super(a, b);
	}
	double calcArea() {
		return 0.5*dimen1*dimen2;
	}
}
public class TestFigure {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,5);
		Triangle t1 = new Triangle(4,8);
		double area1=r1.calcArea();
		double area2=t1.calcArea();
		System.out.println(area1);
		System.out.println(area2);
	}
}
