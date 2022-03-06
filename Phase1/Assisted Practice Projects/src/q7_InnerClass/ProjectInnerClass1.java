package q7_InnerClass;

import q7_InnerClass.ProjectInnerClass1.Inner;

public class ProjectInnerClass1 {
	private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		ProjectInnerClass1 obj=new ProjectInnerClass1();
		ProjectInnerClass1.Inner in=obj.new Inner();  
		in.hello();  
	}


}