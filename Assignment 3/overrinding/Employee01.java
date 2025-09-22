



 class Salary{
	int sal = 10000;
}

public class Employee01 extends Salary{
	int sal = 2300;
	public void display(){
		System.out.println("Salary is: "+super.sal);
		System.out.println("Salary is: "+sal);
	}
	public static void main(String args[]){
		Employee01 a = new Employee01();
		a.display();
		

	}
}