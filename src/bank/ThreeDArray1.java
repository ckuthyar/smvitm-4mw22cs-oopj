package bank;
//Attendance of Students in Year 1,2,3,4
//Attendance of Students in CS,AD,AI,EC,ME,CE
//Attendance of Students in Oct, Nov
public class ThreeDArray1 {

	public static void main(String[] args) {
		int[][][] count1=new int[4][6][2];
		int i,j,k;
		for(i=0;i<4;i++) {
			for(j=0;j<6;j++) {
				System.out.print("Year "+i+" "+j+" - ");
				for(k=0;k<2;k++) {
					count1[i][j][k]=(int)(Math.random()*60);
					System.out.print(count1[i][j][k]+" ");
				}
				System.out.print(" - for Oct,Nov");
				System.out.println();
			}
			System.out.println();
		}

	}

}
