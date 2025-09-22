class Goal{
	public void Display(){
		System.out.println("Goal is to become Doctor");
		
	}
	
}
class Krish extends Goal{
	public void Display(){
		System.out.println("Goal is to become Space Resercher");
		super.Display();
		

	}
	super.Display();
	
	public static void main(String args[]){
		Krish a = new Krish();
		a.Display();
		
	}
}
