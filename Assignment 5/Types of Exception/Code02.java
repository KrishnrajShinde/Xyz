public class Code02{
	public static void main(String args[]){
		
		try{
			String a = null;
			
			System.out.println("The length "+a.length());
		}
		catch(Exception e){
			System.out.println("String is null "+e);
		}

	}
}