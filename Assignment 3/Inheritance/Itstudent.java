class Student{
	int fees;
	String College = "Sanjivani";
	

}
class Itstudent extends Student{
	int iterafees = 200;
	public void display()
	{
		System.out.println("In Display of ItStudent");
	}
	public static void main(String args[])
	{
		Itstudent i = new Itstudent();
		i.fees=91000;
		i.display();
		System.out.println("It student fees is: "+i.fees);
		System.out.println("It student Itera fees is: "+i.iterafees);
		int total_fees = i.fees+i.iterafees;
		System.out.println("It student Total fees is: "+total_fees);
		System.out.println("The college name: "+i.College);
	}
} 