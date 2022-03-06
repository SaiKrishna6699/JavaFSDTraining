package q2_AccessModifier1;

class PrivateClass1 {
	private void display() {
		System.out.println("You are using private Access Specifier");
	}

}

public class ClassB {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		PrivateClass1 obj = new PrivateClass1(); 
        

	}
}