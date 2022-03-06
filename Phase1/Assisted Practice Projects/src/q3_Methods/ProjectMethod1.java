package q3_Methods;

class Method2{
	double d1 = 27.7;
}

class Method1{
	void test(Method2 meth2) {
		meth2.d1++;
	}
}

public class ProjectMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1 meth1 = new Method1();
		Method2 meth2 = new Method2();
		
		meth1.test(meth2);
		
		System.out.println(meth2.d1);

	}

}