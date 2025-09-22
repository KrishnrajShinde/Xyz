public class Code01{
	public static void main(String args[]){
		String name = null;
		try{
			System.out.println(name.charAt(0));
		}
		catch(Exception e){
			System.out.print("name is null "+e);
		}
	}
}