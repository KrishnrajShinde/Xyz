abstract class BankAccount
{
	public abstract void deposite();
	public abstract void withdrawl();
	public abstract void getBalance();
	public void getDetail()
	{
		System.out.println("Yash");
	}
}
class SavingAccount extends BankAccount
{
	public void deposite()
	{
		System.out.println("upto 10,000,00");		
	}
	public void withdrawl()
	{
		System.out.println("upto 4,00,000");	
	}
	public void getBalance()
	{
		System.out.println("4,50,000")	
	}
}
public class Testabstract
{
	public static void main(String args[])
	{
		SavingAccount s = new Code();
		//BankAccount c  = new BankAccount();
		s.getDetail();
		s.deposite();
		s.withdrawl();
		s.getBalance();
		//c.getdetail();
				
	}
}

	
	