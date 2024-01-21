package bank7;

public class TestAccount {

	public static void main(String[] args) {
		Account ac;
		Account ac1=new Account(10001,"James",5000);
		Account ac2=new SavingsAccount("Mike", 5000);
		Account ac3=new CurrentAccount("Tony",6000);
		ac1.display();
		ac1.deposit(1000);
		ac1.display();
		ac1.withdraw(7000);
		ac1.display();
		System.out.println();
		
		ac3.display();
		ac3.deposit(2000);
		ac3.display();
		ac3.withdraw(8000);
		ac3.display();
		
		
				
		
		

	}

}
