package bank;
//Photos in mobile gallery of Akash,Babu,Chandra,Dinesh
public class IncDec1 {

	public static void main(String[] args) {
		int photos_Akash=10;
		int photos_Babu=20;
		int photos_Chandra;
		int photos_Dinesh;
		
		photos_Chandra=++photos_Babu; //Babu took 1 photo and sent to Chandra
		photos_Dinesh=photos_Akash++; //Akash sent to Dinesh, then took 1 photo
		photos_Chandra++;  //Chandra took 1 photo
		
		System.out.println("Akash: "+photos_Akash+" photos");
		System.out.println("Babu "+photos_Babu+" photos");
		System.out.println("Chandra "+photos_Chandra+" photos");
		System.out.println("Dinesh "+photos_Dinesh+" photos");
	}

}
