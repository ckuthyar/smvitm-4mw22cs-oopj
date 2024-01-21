package bank3;
class Amoeba{
	int dim1;
	public void draw() {
		System.out.println("Draw an amoeba");
	}
}
class Earth extends Amoeba{
	public void draw() {
		System.out.println("Draw an Earth");
	}
}
public class Shape3 {

	public static void main(String[] args) {
		Amoeba a1 = new Amoeba();
		a1.draw();
		Earth e1 = new Earth();
		e1.draw();

	}

}
