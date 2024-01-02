package bank2;
class MyPoint{
	private int x,y;
	public MyPoint() {
		this.x=0;this.y=0;}
	public MyPoint(int x, int y) {
		this.x=x;this.y=y;}
	public void setXY(int x, int y) {
		this.x=x;this.y=y;}
	public int[] getXY() {
		int[] arr1= {x,y};return arr1;}
	public double getDistance(int x, int y) {
		int xDiff=this.x-x;
		int yDiff=this.y-y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);}
	public double getDistance(MyPoint another) {
		int xDiff=this.x-another.x;
		int yDiff=this.y-another.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);}
	public double getDistance() {
		return Math.sqrt(x*x +y*y);}
}
public class TestMyPoint2 {
	public static void main(String[] args) {
		 MyPoint point1 = new MyPoint();
		 MyPoint point2 = new MyPoint(1,2);
		 MyPoint point3 = new MyPoint(5,6);
		 double d1 = point3.getDistance();
		 System.out.println(d1);
	}
}
