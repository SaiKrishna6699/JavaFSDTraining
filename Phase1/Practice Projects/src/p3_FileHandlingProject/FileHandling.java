package p3_FileHandlingProject;

import java.io.*;
import java.util.*;

public class FileHandling {
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		 String option,cont; 
		 
		 do { 
		 System.out.println("Employee Information System\n\n");
		 
		 System.out.println("\t 1 Add New Employee Record : ");
		 System.out.println("\t 2 View All Employee Record : ");
		 System.out.println("\t 3 Delete Employee Record : ");
		 System.out.println("\t 4 Search Specific Record : ");
		 System.out.println("\t 5 Update Specific Record : \n\n"); 
		 
		 System.out.println("SELECT FROM ABOVE option: ");
		 option = s.nextLine();
		 
		 switch(option) {
		 
		 case "1":
			 try {
				 Add_Record();
			 } 
			 catch (IOException e) {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
			 }
			 break;

		 case "2":
			 try {
				 ViewAll_Record();
			 } 
			 catch (IOException e) {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
			 }
			 break;
		 
		 
		 case "3":
		    try {
		    	DeleteRecord_ByID();
		    }
		    catch (IOException e) {
		    	// TODO Auto-generated catch block
		    	e.printStackTrace();
		    }
		    break;
		 
		 case "4":
			 try {
				 SearchRecord_ByID();
			 }
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 break;
		 
		 
		 case "5":
			 try {
				 UpdateRecord_byID();
			 }
			 catch (IOException e) {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
				 break;
			 }
		 
		 default:
				System.out.println("Entered Wrong Input!");
				break;
		 
		 }
		 System.out.println("\n");
		 System.out.println("DO YOU WANT TO CONTINUE :YES/NO");
		 cont = s.nextLine();
		 
		 }while( cont.equalsIgnoreCase("YES") );
		}
		 public static void Add_Record() throws IOException {
		 
		 BufferedWriter bfw = new BufferedWriter( new FileWriter("records.txt",true) );
		 @SuppressWarnings("resource")
		Scanner FileInput = new Scanner(System.in);
		 
		 String ID, name, age, addr;
		 
		 System.out.print("Enter the Employee ID: ");
		 ID = FileInput.nextLine();
		 System.out.print("Enter the Employee Name: ");
		 name = FileInput.nextLine();
		 System.out.print("Enter the Employee Age: ");
		 age = FileInput.nextLine();
		 System.out.print("Enter the Employee Address: ");
		 addr = FileInput.nextLine(); 
		 
		 bfw.write(ID +","+ name+ ","+ age+ ","+ addr);
		 bfw.flush();
		 bfw.newLine();
		 bfw.close();
		 
		 }
		 
		 
		 
		public static void ViewAll_Record() throws IOException {
		 BufferedReader bfr = new BufferedReader( new FileReader("records.txt") );
		 
		 String record;
		 
		 System.out.println(" ------------------------------------------------------------- ");
		 
		 System.out.println("| ID Name Age Address |");
		 
		 System.out.println(" ------------------------------------------------------------- ");
		 
		 while( ( record = bfr.readLine() ) != null ) {
		 
		 StringTokenizer st = new StringTokenizer(record,",");
		 
		 System.out.println("| "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" |");
		 }
		 
		 System.out.println("| |");
		 
		 System.out.println(" ------------------------------------------------------------- ");
		 bfr.close(); 
		 
		 }
		
		
		public static void DeleteRecord_ByID() throws IOException {
		 @SuppressWarnings("resource")
		Scanner FileInput = new Scanner(System.in);
		 String ID, record;
		 
		 
		 File tempDB = new File("records_temp.txt");
		 File db = new File("records.txt");
		 
		 
		 BufferedReader br = new BufferedReader( new FileReader( db ) );
		 BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
		 
		 
		 System.out.println("\t\t Delete Employee Record\n");
		 
		 System.out.println("Enter your Employee ID: ");
		 ID = FileInput.nextLine();
		 
		 
		 while( ( record = br.readLine() ) != null ) {
		 
		 
		 if( record.contains(ID) ) 
		 continue;
		 
		 bw.write(record);
		 bw.flush();
		 bw.newLine();
		 }
		 
		 br.close();
		 bw.close();
		 
		 db.delete();
		 
		 tempDB.renameTo(db);
		 }
		
		
		public static void SearchRecord_ByID() throws IOException {
		 String ID,record;
		 @SuppressWarnings("resource")
		Scanner FileInput = new Scanner(System.in);
		 
		 BufferedReader br = new BufferedReader( new FileReader("records.txt") );
		 
		 System.out.println("\t\t Search Employee Record\n");
		 
		 
		 System.out.println("Enter the Employee ID: ");
		 ID = FileInput.nextLine();
		 
		 System.out.println(" ------------------------------------------------------------- ");
		 System.out.println("| ID Name Age Address |");
		 System.out.println(" ------------------------------------------------------------- ");
		 
		 while( ( record = br.readLine() ) != null ) {
		 
		 StringTokenizer st = new StringTokenizer(record,",");
		 if( record.contains(ID) ) {
		 System.out.println("| "+st.nextToken()+" "+st.nextToken()+"|"+st.nextToken()+" "+st.nextToken()+"|");
		 }
		 }
		 
		 System.out.println("| |");
		 System.out.println(" ---------------------------------------------- ");
		 
		 br.close();
		 }
		
		
		public static void UpdateRecord_byID() throws IOException {
		 String newName, newAge, newAddr, record, ID,record2;
		 
		 File db = new File("records.txt");
		 File tempDB = new File("records_temp.txt");
		 
		 BufferedReader br = new BufferedReader( new FileReader(db) );
		 BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
		 
		 @SuppressWarnings("resource")
		Scanner FileInput = new Scanner(System.in);
		 
		 System.out.println("\t\t Update Employee Record\n\n"); 
		/**/
		 System.out.println("Enter the Employee ID: ");
		 ID = FileInput.nextLine(); 
		 System.out.println(" -------------------------------------------------------------");
		 System.out.println("| ID Name Age Address |");
		 System.out.println(" -------------------------------------------------------------");
		 
		 while( ( record = br.readLine() ) != null ) {
		 
		 StringTokenizer st = new StringTokenizer(record,",");
		 if( record.contains(ID) ) {
		 System.out.println("| "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" |");
		 }
		 
		 } 
		 System.out.println("| |");
		 System.out.println(" -------------------------------------------------------------");
		 
		 br.close();
		 
		 System.out.println("Enter the new Name: ");
		 newName = FileInput.nextLine(); 
		 System.out.println("Enter the new Age: ");
		 newAge = FileInput.nextLine(); 
		 System.out.println("Enter the new Address: ");
		 newAddr = FileInput.nextLine(); 
		 
		 BufferedReader br2 = new BufferedReader( new FileReader(db) );
		 
		 while( (record2 = br2.readLine() ) != null ) { 
		 if(record2.contains(ID)) {
		 bw.write(ID+ ","+newName+ ","+ newAge+ ","+ newAddr);
		 } else {
		 
		 bw.write(record2);
		 } 
		 bw.flush();
		 bw.newLine();
		 }
		 
		 bw.close();
		 br2.close(); 
		 db.delete(); 
		 boolean success = tempDB.renameTo(db); 
		 System.out.println(success);	
	}
}

/*
 *  Program by Rajagopal Sai Krishna
 *  Git Id SaiKrishna6699
 * 
 * 
 */
