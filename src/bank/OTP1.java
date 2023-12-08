package bank;
import java.util.Random;
import java.util.ArrayList;
public class OTP1 {
	public static ArrayList genOTP1(int len1, int qty) {
		ArrayList<String> otplist=new ArrayList<>();
		for (int i=0;i<qty;i++) {
			otplist.add(genOTP1(len1));
		}
		return otplist;
	}
	public static String genOTP1(int len1) {
		Random rand = new Random();
		StringBuilder otp=new StringBuilder();
		for(int i=0;i<len1;i++) {
			otp.append(rand.nextInt(10));
		}
		return otp.toString();
	}

	public static void main(String[] args) {
		ArrayList<String>otplist = new ArrayList<>();
		int size=6;
		int count=10;
		System.out.println(genOTP1(size));
		System.out.println(genOTP1(size,count));
	}
}
