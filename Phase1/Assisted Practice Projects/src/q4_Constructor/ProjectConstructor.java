package q4_Constructor;


class DefA{
	int a;
	int b;
	
	DefA(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println(a+ "" + " + " + "" + b + " = " + "" +(a+b));
	}
	
	void Display() {
		System.out.println("Method only prints when it is called unlike Constructor");
		System.out.println(a+ "" + " + " + "" + b + " = " + "" +(a+b));
	}
}

class DefB{
	int ab;
	String str;
	
	public DefB(int ab, String str) {
		this.ab = ab;
		this.str = str;
	}
	
	public DefB() {
		
	}
	
}
class DefC extends DefB{
	
	public DefC() {
		System.out.println("C constructor is called");
	}
	
	
}
public class ProjectConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefA aa = new DefA(27, 23);
		DefC c = new DefC();
		System.out.println();
		
		DefA ac = new DefA(5, 7);
		ac.Display();
	}

}
