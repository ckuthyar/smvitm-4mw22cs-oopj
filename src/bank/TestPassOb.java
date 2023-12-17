package bank;
class PassOb{
	int a,b;
	PassOb(int i, int j){
		a=i; b=j;}
	boolean equalTo(PassOb o) {
		if(o.a==a && o.b==b) return true;
		else return false;}
}
public class TestPassOb {
	public static void main(String[] args) {
		PassOb ob1=new PassOb(100,22);
		PassOb ob2=new PassOb(100,22);
		PassOb ob3=new PassOb(-1,1);
		System.out.println(ob1.equalTo(ob2));
		System.out.println(ob1.equalTo(ob3));}}
