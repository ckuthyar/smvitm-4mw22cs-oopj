package bank7;
public enum EnumMonths1 {
	JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;
	public static void main(String[] args) {
		EnumMonths1 month=JAN;
		int days=0;
		switch(month) {
		case JAN,MAR,MAY,JUL,AUG,OCT,DEC:days=31;
		case APR,JUN,SEP,NOV:days=30;
		case FEB:days=28;
		System.out.println("assigned days to each month");
		System.out.println(EnumMonths1.JAN.ordinal());}}}
//Print the days in each month of the year
//If Leap Year, change Feb days=29