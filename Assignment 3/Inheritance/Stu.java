class Student
{
	String name = "Prajwal";
	String college = "Sanjivani College";
	
}

class Roll_no extends Student
{
	int roll_no = 14;
	int mark = 80;
}

class Stu extends Roll_no
{
	public static void main(String args[])
	{
		Stu s = new Stu();
		System.out.println("The name of Student is "+s.name);
		System.out.println("The name of College is "+s.college);
		System.out.println("The roll no of Student is "+s.roll_no);
		System.out.println("The mark of Student is "+s.mark);
		
	}
}