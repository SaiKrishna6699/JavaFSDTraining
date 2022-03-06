package q2_AccessModifier2;

import q2_AccessModifier1.*;

public class ClassD extends ClassC{
	public static void main(String[] args) {
		ClassD obj = new ClassD();
		System.out.println("Accessing Protected Class C from Class D in package B");
		obj.display();
	}
}