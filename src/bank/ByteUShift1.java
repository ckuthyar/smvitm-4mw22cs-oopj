package bank;
//not fully understood
public class ByteUShift1 {

	public static void main(String[] args) {
		char[]hex= {'0','1','2','3','4','5','6','7','8',
				'9','a','b','c','d','e','f'};
		byte b1=(byte)0xf1;
		byte c1=(byte)(b1>>4);
		byte d1=(byte)(b1>>>4);
		byte e1=(byte)(b1&0xff >>4);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(d1);

	}

}
