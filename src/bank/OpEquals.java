package bank;
//Best Student Award based on Sports,Academics,Cultural
//Penalty for improper conduct, behaviour, time-wasting tactics
public class OpEquals {

	public static void main(String[] args) {
		int points_sports=1;
		int points_academics=2;
		int points_cultural=3;
		int penalty=0;
		int total1=0;
		int total2=0;
		
		points_sports+=3;
		points_academics+=4;
		total1=points_sports+points_academics+points_cultural;
		penalty=total1%6;    //max penalty points to be less than 6
		total2=total1-penalty;
		System.out.println("total1: "+total1+" points");
		System.out.println("penalty: "+penalty+ " points");
		System.out.println("total2: "+total2+ " points");

	}

}
