package q8_String;

import java.util.*;

public class ProjectString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Methods of Strings");
		
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		str1 = sc.nextLine();
		str2 = sc.next();
		sc.close();
		
		//Length of String
		int a = str1.length();
		int b = str2.length();
		System.out.println("Length of the String 1 is: " + a + "\n" + "Length of the String 2 is: " + b);
		
		//Substring
		System.out.println(str1.substring(4));
		
		//String Comparision
		System.out.println(str1.compareTo(str2));
		
		//is Empty
		String str3= "";
		System.out.println(str3.isEmpty());
		System.out.println("Is Str1 Empty: " + str1.isEmpty());
		
		//toLowerCase
		System.out.println(str2.toLowerCase());
		
		//toUpperCase
		System.out.println(str2.toUpperCase());
		
		//equal
		System.out.println(str1.equals(str2));
		
		//Creating StringBuffer and append method
				StringBuffer s=new StringBuffer("Welcome to Java!");
				s.append("Enjoy your learning");
				System.out.println(s);

				//insert method
				s.insert(0, 'w');
				System.out.println(s);

				//replace method
				StringBuffer sb=new StringBuffer("Hello");
				sb.replace(0, 2, "hEl");
				System.out.println(sb);

				//delete method
				sb.delete(0, 1);
				System.out.println(sb);
				
				//StringBuilder
				System.out.println("\n");
				System.out.println("Creating StringBuilder");
				StringBuilder sb1=new StringBuilder("Happy");
				sb1.append("Learning");
				System.out.println(sb1);

				System.out.println(sb1.delete(0, 1));

				System.out.println(sb1.insert(1, "Welcome"));

				System.out.println(sb1.reverse());
						
				//conversion	
				System.out.println("\n");
				System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
				
				String str = "Hello"; 
		        
		        // conversion from String object to StringBuffer 
		        StringBuffer sbr = new StringBuffer(str); 
		        sbr.reverse(); 
		        System.out.println("String to StringBuffer");
		        System.out.println(sbr); 
		          
		        // conversion from String object to StringBuilder 
		        StringBuilder sbl = new StringBuilder(str); 
		        sbl.append("world"); 
		        System.out.println("String to StringBuilder");
		        System.out.println(sbl);              

		
	}

}
