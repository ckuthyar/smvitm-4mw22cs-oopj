package bank;

public class Even1 {

	public static void main(String[] args) {
		int[] even= {2,4,6,8,10};
		int[] odd = {1,3,5,7,9};
		int[] all = new int[10];
		for(int i=0;i<5;i++) {
			all[i]=even[i];
		}
		for(int i=0;i<5;i++) {
			all[5+i]=odd[i];
		}
		
		
		

	}

}
