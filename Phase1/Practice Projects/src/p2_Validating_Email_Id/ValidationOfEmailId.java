package p2_Validating_Email_Id;


import java.util.*;
import java.util.regex.*;
import java.util.ArrayList;

public class ValidationOfEmailId {
	//Regular Expression
		static String regex = "^(.+)@(.+)$";
		
		public static boolean isValidEmail(String Email) {
			//Compile Regular Expression in pattern
			Pattern p = Pattern.compile(regex);
			
			//Creating Instance of Matcher
			Matcher m = p.matcher(Email);
			
			return m.matches();
		}
		
		public static void main(String Args[]) {
			//Initialized Scanner to take input
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Number of Emails needed to be vailidated: ");
			int n = sc.nextInt(); 
			
			//Initializing Array of String using Array List
			List<String> Emails = new ArrayList<String>();
			
			System.out.println("Email Id should start with letter or numbers and should need to contain a '@' Symbol in middle.\n");
			System.out.println("Ex MailId: Example@domain .\n");
			System.out.println("Enter the Email Ids\n");
			
			//loop to take email id's
			for(int i=0; i<n; i++) {
				System.out.println("Enter the Email Id No: " + (i+1));
				String s = sc.next();
				Emails.add(s);
			}
			//Iterating the eMails Array List
			for (String mailId : Emails) {
				//printing the output
				System.out.println("The Email address " + mailId + " is:" + (isValidEmail(mailId) ? "Valid" : "Invalid"));
			}
			
		}

}
/*
 * 
 * 	Validation of Email Id
 *
 *  Program by Rajagopal Sai Krishna
 *  Git Id SaiKrishna6699
 *  
 * 
 */
