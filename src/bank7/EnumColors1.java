package bank7;
import java.util.Scanner;
public enum EnumColors1 {
	BLACK("#000000"),
	RED("#FF0000"),
	GREEN("#00FF00"),
	BLUE("0000FF"),
	WHITE("FFFFFF");
	private String code;
	private EnumColors1(String code) {
		this.code=code;}
	public String getCode() {
		return code;}
	public void setCode(String code) {
		this.code=code;}
	public static void main(String[]args) {
		System.out.println(EnumColors1.RED.ordinal());
		System.out.println(EnumColors1.RED.getCode());
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter color to get code");
		String color1=sc1.next();
		String color2=color1.toLowerCase();
		// System.out.println(EnumColors1.valueOf(color1));
		System.out.println(EnumColors1.valueOf(color2));
		System.out.println(EnumColors1.valueOf(color2).getCode());}
}