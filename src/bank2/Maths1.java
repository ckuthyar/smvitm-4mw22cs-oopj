package bank2;

public class Maths1 {
	public static void main(String[] args) {
		int limit=100;
		for(int j=2;j<limit+1;j++) {
			for(int i=0;i<(limit/j)+1;i++) {
				System.out.print(j*i+" ");
			}
			System.out.println();
		}
	}		
}


