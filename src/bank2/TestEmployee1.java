package bank2;
class Employee{
	private int id;
	private String name;
	private double salary;
	public Employee(int id,String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void raiseSalary(double percent) {
		if(percent>0) {
			double raiseAmount=salary*percent/100;
			salary=salary+raiseAmount;
			System.out.println(name+"'s salary raised by "+percent+"%");
		}else {
			System.out.println("Invalid percentage. Salary remains unchanged");
		}
	}
	public void viewEmpDetails() {
		System.out.println(id+"-"+name+"-"+salary);}
}
public class TestEmployee1 {
	public static void main(String[] args) {
		Employee suresh=new Employee(1, "Mr. Suresh",5000);
		suresh.viewEmpDetails();
		suresh.raiseSalary(10);
		suresh.viewEmpDetails();
	}
}
