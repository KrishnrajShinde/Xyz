import java.util.*;
class TestException01{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Numerator: ");
		int n = sc.nextInt();
		System.out.print("Enter the Denomenator: ");
		int d = sc.nextInt();
		try{
			int c = n/d;
			System.out.println("The division is: "+c);
		}
		catch(Exception e){
			System.out.print("Cannpt divide by zero: "+e);
		}
	}
}