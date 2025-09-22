class Employee{
	int Salary=10000;
	public void display(){
		System.out.println("THE EMPLOYEE INFORMATION");
	}
	
	
}
public class Programmer extends Employee{
	String name= "Yashraj";
	int bonus = 2000;
	public static void main(String args[])
	{
		Programmer i = new Programmer();
		i.display();
		System.out.println("The Salary with bonus  of "+i.name+" is "+(i.Salary+i.bonus));
	}
}
