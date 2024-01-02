class Point{
	                       // declare x co-ordinate
	                       // declare y co-ordinate
}
Point(){
	                           //no-args constructor, intialize x to zero
	                           //no-args constructor, initialize y to zero
}
Point(int x, int y){
								//parameterized constructor, 2 input parameters x, y
								//initialize x and y using "this" keyword
}
public void calcDistance() {
									//method with no arg - distance of a point from the origin(0,0)
	
	
	
}
public void calcDistance(int x, int y) {
	
				
										//method with 2 args - distance of a point from these 2 coordinates
}
public void calcDistance(Point pointM) {
	
	
										//method with object being passed as parameter. Computer x and y
}										//of point using pointM.x, pointM.y and apply distance formula
@Override
public String toString() {
	return 										  	//override toString method to print x,y
}
public       getXY() {                                   //put array as datatype in blank space
													//create a variable called position to return {x,y}
}
public class TestPoint {
	public static void main(String[] args) {
		Point point1 =                               //create new object with (3,4)
        Point point2 = 								//create new object by passing (5,6)
        Point point3 =                              //create new object by passing (10,28)
        double d1=									//calculate distance from point 1 to origin
        double d2=									//calculate distance from point 1 to (9,12)
        double d3=                                  //calculate distance from point 1 to point3
        System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(point1);
		System.out.println(                            )//print x and y using getXY() method
		
	}   
	

}
