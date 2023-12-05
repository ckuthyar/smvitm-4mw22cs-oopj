package bank;
//@Kuthyar
//Combine elements of 2 arrays(odd, even) into 1 array(all)
public class Arrays1 {

	public static void main(String[] args) {
		int[] even= {2,4,6,8,10};
		int[] odd = {1,3,5,7,9};
		int[] all = new int[10];
		int len1=even.length;
		int len2=odd.length;
		
		for(int i=0;i<len1;i++) {
			all[i]=even[i];
		}
		for(int i=0;i<len2;i++) {
			all[i+5]=odd[i];
		}
		for(int i=0; i<len1+len2;i++) {
			System.out.println(all[i]);
		}
		
	
		

	}

}
