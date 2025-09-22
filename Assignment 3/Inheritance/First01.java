public class First01
{
	public static void Add()
	{
		int a = 3;
		int b = 2;
		int c = a + b;
		System.out.println("The Addition is: "+c);
	}
	public static int Add(int a, int b)
	{
		return a+b;
	}
	public static float Add(float a, float b)
	{
		return a+b;
	}
	public static double Add(double a, double b)
	{
		return a + b;
	}
	public static void main(String args[])
	{
		First01 s = new First01();
		s.Add();
		System.out.println(s.Add(4,5));
		System.out.println(s.Add(4.2f,5.5f));
		System.out.println(s.Add(4.55,5.99));
	}
}