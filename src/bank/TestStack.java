package bank;
import java.util.Scanner;
class Stack{
	int top;
	int s[] = new int[10];
	Stack() {
		top=-1;}
	void push(int item) {
		if(s.length-1==top) {
			System.out.println("Stack Overflow");}
		else {
			top=top+1;
			s[top]=item;}}
	void pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");}
		else {
			int item=s[top];
			System.out.println("Item popped is"+item);
			top=top-1;}}
	void display() {
		if(top==-1) {
			System.out.println("Stack is empty. No items to display");
		}
		else {
			System.out.println("Items in the Stack are");
			for(int i=top;i>0;i--) {
				System.out.println(s[i]);}}}}

public class TestStack {
	public static void main(String[] args) {
		int ch;
		Stack stk=new Stack();
		Scanner sc1=new Scanner(System.in);
		while(true) {
			System.out.println("Stack Operations Demo");
			System.out.println("Enter 1:Push 2:Pop 3:Display 4:Exit");
			ch=sc1.nextInt();
			switch(ch) {
			
			case 1: System.out.println("Enter the item to be pushed");
			int item=sc1.nextInt();
			stk.push(item);
			break;
			
			case 2: stk.pop();
			break;
			
			case 3: stk.display();
			break;
			
			case 4: System.exit(0);
			
			default: System.out.println("Enter the valid choice");
			}
		}
	}

}
