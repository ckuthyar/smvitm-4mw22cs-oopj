package bank;
//Number of days in each of the 12 months
public class Array1 {

	public static void main(String[] args) {
		int days[];
		days=new int[12];
		days[0]=31;
		days[1]=28;
		days[2]=31;
		days[3]=30;
		days[4]=31;
		days[5]=30;
		days[6]=31;
		days[7]=31;
		days[8]=30;
		days[9]=31;
		days[10]=30;
		days[11]=31;
		System.out.println("April has "+days[3]+" days");
	}

}
