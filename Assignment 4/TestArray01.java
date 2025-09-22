import java.util.*;
public class TestArray01{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+(n-1)+" Elements");
		for(int i = 0; i < n-1; i++){
			a[i]=sc.nextInt();
		}
		try{
			System.out.print(a[4]);

		}
		catch(Exception e){
			System.out.print("upto 4 only "+e);
		}
		
	}
}