package bank;
public class Rainfall1 {
	public static void main(String[] args) {
		String[] cities= {"Bombay","Delhi","Chennai","Bangalore"};
		String[] months= {"Jun","Jul","Aug"};
		int tot_jun=0,tot_jul=0,tot_aug=0;
		int total1=0;
		int[][] rainfall= {
				{12,14,18},
				{3,7,9},
				{10,20,30},
				{8,12,4}
		};
		tot_jun=rainfall[0][0]+rainfall[1][0]+rainfall[2][0]+rainfall[3][0];
		tot_jul=rainfall[0][1]+rainfall[1][1]+rainfall[2][1]+rainfall[3][1];
		tot_aug=rainfall[0][2]+rainfall[1][2]+rainfall[2][2]+rainfall[3][2];
		total1=tot_jun+tot_jul+tot_aug;
		System.out.println(total1);
	}

}
