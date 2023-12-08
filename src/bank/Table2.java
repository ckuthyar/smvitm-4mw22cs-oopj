import java.util.Scanner;
public class Table2{
    public static void table1(int start, int end){
        start=3;
        end=5;
        for (int j=start;j<end+1;j++){
         for (int i=1;i<11;i++){
           String info1=(j + ","+i+","+j*i);
           System.out.println(info1);
           }
         System.out.println("\n");
      }
    }
    
    public static void main(String[] args){
     File f1=new File("in1.txt");
     Scanner sc1=new Scanner(f1);
     int num1=sc1.nextInt();
     int num2=sc1.nextInt();
     table1(num1,num2);
    
   
     
   }
}
