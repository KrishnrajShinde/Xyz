class Code1{
	int salary = 10000;
}

public class Employee extends Code1{
	
	public static void main(String args[]){
		Employee a = new Employee();
		System.out.println("Salary is : "+a.salary);
		
	}
}