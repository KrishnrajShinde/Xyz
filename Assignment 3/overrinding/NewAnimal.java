inheritance Animal
{
	public static void Baby(){
		System.out.println("Crying");
	}
}
inheritance Human
{
	public static void Baby(){
		System.out.println("Human Crying");
	}
}

class NewAnimal implements Animal,Human{
	public static void Baby(){
		System.out.println("New Animal Crying");
		//Ovverides
	}
	public static void main(String args[])
	{
		NewAnimal s = new NewAnimal();
		s.Baby();
	}
}

