public class TestException{
public static void main(String args[])
{
	int a = 10;
	int b = 0;
	try{
		int c=a/b;
		System.out.println("Division is :"+c);
	}
	catch(Exception e)
	{
	System.out.println("Cannot Divide by zero");
	}
}
}
