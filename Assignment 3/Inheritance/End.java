class Student011
{
	
	
		//System.out.println("My name is Yashraj");
		int roll=13;
	
}

class Sem1 extends Student011
{
	int mark1 = 98;
}

class Sem2 extends Student011
{

	int mark2 = 89;
}

class End
{
	public static void main(String args[])
	{
		Sem1 sem1 = new Sem1();
		System.out.println("Mark of sem1 "+sem1.mark1);
		Sem2 sem2 = new Sem2();
		System.out.println("Mark of sem2 "+sem2.mark2);
		
			
		

		
		
	}
}