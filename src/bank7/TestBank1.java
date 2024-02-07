package bank7;
import java.util.Scanner;
import java.util.regex.*;
public class TestBank1 {
	public enum Command{
		OPEN("([Oo][Pp][Ee][Nn]"){
			public String toString() {return "Open Account";}},
		DEPOSIT("[Dd][Ee][Pp][Oo][Ss][Ii][Tt]"){
			public String toString() {return "Deposit Amount";}},
		WITHDRAW("[Ww][Ii][Tt][Hh][Dd][Rr][Aa][Ww]"){
			public String toString() {return "Withdraw Amount";}},
		QUIT("[Qq][Uu][Ii][Tt]"){ 
			public String toString() {return "Quit NetBanking";}};
		private String input1;
		private Command(String s1) {
			this.input1=s1;}}
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		String inputCommand="";
		System.out.println("Enter command");
		inputCommand=sc1.nextLine();
		//System.out.println(Command.valueOf(inputCommand));
		System.out.println(Command.valueOf(inputCommand));
		System.out.println(Command.QUIT.ordinal());
		System.out.println(Command.OPEN.toString());}}
