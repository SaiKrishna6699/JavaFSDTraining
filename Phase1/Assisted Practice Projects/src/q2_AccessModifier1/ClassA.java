package q2_AccessModifier1;

class defClassA {
	void display()
	{
		System.out.println("You are using defalut access Modifier"); 
	}
}

public class ClassA{
	public static void main(String[] args) {
		System.out.println("Default Access Modifier");
		defClassA obj = new defClassA(); 		  
        obj.display(); 

	}
}