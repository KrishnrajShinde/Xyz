public class Second02
{
	public static int Add(int a,int b)
	{
		return a+b;
	}
	public static int Add(int a, int b, int c)
	{
		return a+b+c;
	}
	public static void main(String args[])
	{
		Second02 s = new Second02();
		System.out.println(s.Add(1,2));
		System.out.println(s.Add(1,2,3));
	}
	
}
	
