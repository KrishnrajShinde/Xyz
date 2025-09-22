import java.util.*;
public class Code04{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for(int i = 0 ;i < a.length; i++){
			a[i]=sc.nextInt();
		}

		try{
			System.out.print("Enter index: ");
			int idx = sc.nextInt();
			System.out.print("The element at index "+idx+" is "+a[idx]);
		}
		catch(Exception e){
			System.out.print("Size toh dekh le jhatu "+e);
		}	
		
		
	}
}