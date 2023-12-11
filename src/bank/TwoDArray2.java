package bank;
//Calculate total working days last 3 weeks
//Week1 - 1,1,1,1,1,0 
//Week2 - 1,1,1,1,1,0
//Week3 - 0,0,1,1,1,0
public class TwoDArray2 {

	public static void main(String[] args) {
		int days[][]= {
				{1,1,1,1,1,1,0},
				{1,1,1,1,1,1,0},
				{0,0,1,1,1,1,0}
		};
		int total=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<7;j++) {
				total=total+days[i][j];
			}
		}
		System.out.println("Total working days in 3 weeks is "+total+" days");

	}

}
