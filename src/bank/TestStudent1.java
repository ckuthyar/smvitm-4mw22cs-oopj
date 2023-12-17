package bank;

class Student{
	int id,marks;
	String name;
	Student(int id, String name, int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	void displayMarks() {
		System.out.println(id+"-"+name+"-"+marks);
	}
	public int updateMarks(int extra) {
		marks=marks+extra;
		return marks;
	}
}
public class TestStudent1 {

	public static void main(String[] args) {
		Student suresh=new Student(1,"SureshRao",80);
		Student ramesh=new Student(2,"RameshUdupa",90);
		suresh.displayMarks();
		ramesh.displayMarks();
		System.out.println();
		
		suresh.updateMarks(5);
		ramesh.updateMarks(4);
		
		suresh.displayMarks();
		ramesh.displayMarks();
	}
}
