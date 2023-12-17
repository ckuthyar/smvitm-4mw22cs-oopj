package bank;
//Output comes as -8,-4,-2,-1  ( not fully understood this)
public class HexByte1 {

	public static void main(String[] args) {
		char[]hex= {'0','1','2','3','4','5','6','7','8',
				'9','a','b','c','d','e','f'};
		byte b=(byte)0xf1;
		System.out.println(b>>1);
		System.out.println(b>>2);
		System.out.println(b>>3);
		System.out.println(b>>4);
	}	
}




