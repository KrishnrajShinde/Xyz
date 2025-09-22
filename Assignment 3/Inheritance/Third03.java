public class Third03
{
	public static float Add(int a, float b)
	{
		return a+b;
	}
	public static float Add(float a, int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		Third03 s = new Third03();
		System.out.println(s.Add(2,2.5));
		System.out.println(s.Add(5.2,1));
	}
}