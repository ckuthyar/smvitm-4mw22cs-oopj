package bank;

public class BoolTest1 {

	public static void main(String[] args) {
		boolean b1,b2,b3;
		int num1, num2;
		num1=10; num2=10;
		b1=(num1>num2);
		b2=(num1<num2);
		b3=(num1==num2);
				
		if(b1) {
			System.out.println(num1+ " is greater than "+num2);
		}
		else if(b2){
			System.out.println(num1+ " is less than "+num2);
		}
		else if(b3) {
			System.out.println(num1+ " is equal to "+num2);
		}

	}

}
