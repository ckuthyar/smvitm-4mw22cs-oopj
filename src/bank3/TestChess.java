package bank3;
class King {
	String color;    //white King or black King
	public void moveSteps(){
		int n1=1;
		System.out.println("I am King. I can move steps: "+n1);
	}
}
class Queen extends King{
	String color;    //white Queen or black Queen
	public void moveSteps(int n1) {
		System.out.println("I am Queen. I can move steps: "+n1); //n1 can be 1, 2,3,4,5,6,7,8
	}
}
class Checkmate extends King{
	
}

public class TestChess {
	public static void main(String[] args) {
		King k1=new King();
		Queen q1=new Queen();
		k1.moveSteps();
		q1.moveSteps(4);
	}
}

//Exercises
//1. Create a class called Pawn.   
//2. A Pawn can move either 1 step forward or 2 steps forward in the Opening Move
//3. Create a method which has 2 different signatures - movePawn(),   movePawn(int n1)
//4. Create 8 objects for White Pawn called  pw1, pw2, pw3, pw4, pw5, pw6, pw7, pw8
//5. Create 8 objects for Black Pawn called  pb1, pb2, pb3, pb4, pb5, pb6, pb7, pb8
//6. Create a Constructor for King which takes color as input parameter
//7. Create a Constructor for Queen which takes color as input parameter
//8. Create an object k2 for Black King
//9. Create an object q2 for Black Queen
//10. Create a class for Knight which goes 2 steps horizontal and 1 step vertical
//11. Create an Interface called "Castling". Let King class implement this Interface
//12. Create an Abstract class called "Checkmate1 with abstract method tryCheckMate()
//13. Create a Subclass called Checkmate2 with concreted method doneCheckMate() with message indicating whether
//    White won or Black won











