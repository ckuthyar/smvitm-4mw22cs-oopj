package bank2;
import java.io.FileWriter;
public class Maths2 {

	public static void main(String[] args)throws Exception{
		int limit=10;
		String info1="";
		String info2="";
		char b1=0;
		FileWriter fw1=new FileWriter("out1.txt");
		FileWriter fw2=new FileWriter("out2.txt");
		for(int j=2;j<11;j++) {
			info1="";
			for(int i=0;i<(limit/j)+1;i++) {
				info1=info1+(j*i+" ");
				//info2 to be added
				System.out.println(b1);
			}
			System.out.println(info1);
			System.out.println(info2);
			fw1.write(info1);
			fw1.write("\n");
			fw2.write(info2);
			fw2.write("\n");
		}
		fw1.close();
		fw2.close();
		
	

	}

}
