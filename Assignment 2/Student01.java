
public class Student01
{
	int roll_no;
	String name;


    public Student01()
    {
		roll_no=21;
		name="Yashraj";
		System.out.println("Student Information");
		System.out.println("roll no: "+roll_no);
		System.out.println("Student name: "+name);

	}

	public Student01(int o,String n)
	{
		roll_no=o;
		name=n;
		System.out.println("Student Information");
		System.out.println("roll no: "+roll_no);
		System.out.println("Student name: "+name);

	}
	public static void main(String args[])
	{
		Student01 s = new Student01();
		Student01 s1 = new Student01(13,"Nikhil");
	}
}












