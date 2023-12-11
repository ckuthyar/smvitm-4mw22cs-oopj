package bank;
//Average marks in 5 subjects-Eng,Phy,Chem,Maths,Bio
public class Average1 {

	public static void main(String[] args) {
		int[]marks = {90,85,90,100,95};
		int total=0;
		double average;
		for(int i=0;i<5;i++) {
			total=total+marks[i];
		}
		average=(total/5);
		System.out.println("Average marks is "+average);

	}

}
