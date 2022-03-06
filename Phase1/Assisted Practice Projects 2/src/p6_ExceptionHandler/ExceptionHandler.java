package p6_ExceptionHandler;

class ExceptionHandler extends Exception {
	String s1;
	
	ExceptionHandler(String s2){
		s1 = s2;
	}
	
	public String toString(){ 
		return("Exception Occured: "+s1);
	}
}

class Ex1{
	public static void main(String[] args) {
		try {
			System.out.println("Starting of try block");
			throw new ExceptionHandler("This is My error Message");
		
		}
		catch(ExceptionHandler e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}
	}
}
