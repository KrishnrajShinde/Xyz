class Salary{
	int sal = 10000;
}

public class Employee01 extends Salary{
	int sal = 2300;
	public static void main(String args[]){
		Employee01 a = new Employee01();
		System.out.println("Salary is: "+a.sal);
	}
}