package bank;
//@Kuthyar 08-Dec-2023
public class ScopeErr1 {

	public static void main(String[] args) {
		int bar=1;
		{               //creating new scope
			int bar=2;  //Compile time error - bar already defined.
		}

	}

}
