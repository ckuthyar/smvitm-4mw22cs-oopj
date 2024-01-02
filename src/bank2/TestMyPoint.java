package bank2;
class MyPoint{
	int x;
	int y;
	MyPoint(){
		this.x=0;
		this.y=0;
	}
	MyPoint(int x,int y){
		this.x=x;
		this.y=y;
	}
	public double getDistance() {
		int xdiff=x-0;
		int ydiff=y-0;
		return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
	}
	public double getDistance(int x,int y) {
		int xdiff=this.x-x;
		int ydiff=this.y-y;
		return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
	}
	public double getDistance(MyPoint another) {
		int xdiff=this.x-another.x;
		int ydiff=this.y-another.y;
		return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
	}
	
}

public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint point1=new MyPoint(1,2);
		MyPoint point2=new MyPoint(5,7);
		MyPoint point3=new MyPoint(8,11);
		double d1=point1.getDistance();
		double d2=point2.getDistance(10,12);
		double d3=point2.getDistance(point3);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

	}

}
