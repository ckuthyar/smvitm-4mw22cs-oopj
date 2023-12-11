package bank;
//"0000","0001","0010","0011","0100","0101","0110","0111" - 0x0 to 0x7
//"1000","1001","1010","1011","1100","1101","1110","1111" - 0x8 to 0xf
public class ByteShift1 {

	public static void main(String[] args) {
		byte a=64; // 0100 0000 (2**6)
		byte out1;
		int out2;
		out1=(byte)(a<<2);  //without casting, compilation error
		out2=a<<2;
		System.out.println("out1: "+out1);
		System.out.println("out2: "+out2);

	}

}
