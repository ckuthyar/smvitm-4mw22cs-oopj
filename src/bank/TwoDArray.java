package bank;
//Calculate total working days last 3 weeks
//Week1 - 1,1,1,1,1,1,0 
//Week2 - 1,1,1,1,1,1,0
//Week3 - 0,0,1,1,1,1,0
public class TwoDArray {
	public static void main(String[] args) {
		int days[][]=new int[3][7];
		int total=0;
		
		days[0][0]=1; //Week1,Mon
		days[0][1]=1; //Week1,Tue
		days[0][2]=1; //Week1,Wed
		days[0][3]=1; //Week1,Thu
		days[0][4]=1; //Week1,Fri
		days[0][5]=1; //Week1,Sat
		days[0][6]=0; //Week1,Sun
		
		days[1][0]=1; //Week2,Mon
		days[1][1]=1; //Week2,Tue
		days[1][2]=1; //Week2,Wed
		days[1][3]=1; //Week2,Thu
		days[1][4]=1; //Week2,Fri
		days[1][5]=1; //Week2,Sat
		days[1][6]=0; //Week2,Sun
		
		days[2][0]=0; //Week3,Mon,Deepavali
		days[2][1]=0; //Week3,Tue,Deepavali
		days[2][2]=1; //Week3,Wed
		days[2][3]=1; //Week3,Thu
		days[2][4]=1; //Week3,Fri
		days[2][5]=1; //Week3,Sat
		days[2][6]=0; //Week3,Sun
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<7;j++) {
				total=total+days[i][j];
			}
		}
		System.out.println("Total working days in 3 weeks is "+total+" days");
		
	}

}
