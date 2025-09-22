class Animal
{
	public static void Baby(){
		System.out.println("Crying");
	}
}

class NewAnimal extends Animal{
	public static void Baby(){
		System.out.println("New Animal Crying");
		
	}

	public static void main(String args[])
	{
		NewAnimal s = new NewAnimal();
		s.Baby();
	}
}

