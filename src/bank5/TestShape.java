package bank5;
class Shape{
	public void draw() {
		System.out.println("Draw a shape");
	}
}

class Marks{
	final int maxmarks=100;
	maxmarks=50;
}
public class TestShape {

	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.draw();

	}

}
