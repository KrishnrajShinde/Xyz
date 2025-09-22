abstract class BankAccount
{
	public abstract void deposite();
	public abstarct void withdrawl();
	public abstarct void getBalance();
	public void getDetail()
	{
		System.out.println("Yash");
	}
}
class Code extends BankAccount
{
	public void deposite()
	{
		
	}
	public void withdrawl()
	{
		
	}
	public void getBalance()
	{
		
	}
}
public class Testabstract
{
	public static void main(String args[])
	{
		BankAccount s = new BankAccount();
		//BankAccount c  = new BankAccount();
		s.getdetail();
		//c.getdetail();
				
	}
}

	
	