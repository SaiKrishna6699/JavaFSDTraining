package VirtualKey;

import java.util.*;

public class MainMenu extends FileOperations{
	
	FileOperations fo = new FileOperations();
	
	public static String MainMenu = "\n"
			+ "MAIN MENU - choose following option to experience lockedMe.com :"
			+ "\n1 -- List files in directory"
			+ "\n2 -- Add,Search or Delete"
            + "\n3 -- Exit Program";
	
	void Main_Menu() {
    	System.out.println(MainMenu);
        try{
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose){
                case 1 : {
                    fo.SortingFiles();
                    Main_Menu();
                }
                case 2 : {
                    Sub_Menu();
                }
                case 3 : {
                    System.out.println("Thank You For Using LockedMe Directory");
                    System.exit(0);
                }
                default: Main_Menu();
            }
            sc.close();
        }
        catch (Exception e){
            System.out.println("Please Enter Option 1, 2 or 3");
            Main_Menu();
        }
    }
	
	void Sub_Menu() {
        System.out.println("\nSelect any of the following Option: \n"+
                " 4 -- Add a file\n"+
                " 5 -- Search a file\n"+
                " 6 -- Delete a file\n"+
                " 7 -- Go Back menu1");
        try{
            Scanner sc = new Scanner(System.in);
            char[] input = sc.nextLine().toLowerCase().trim().toCharArray();
            int i = input[0];

            switch (i){
                case '4' : {
                	System.out.println();
                    System.out.print("For Adding a File into Directory \n Please Enter a File Name : ");
                    String filename = sc.next().toLowerCase();
                    fo.AddFile(filename);
                    break;
                }
                case '5' : {
                	System.out.println();
                    System.out.print("For Searching a File from Directory \n Please Enter a File Name : ");
                    String filename = sc.next();
                    fo.SearchFile(filename);
                    break;
                }

                case '6' : {
                    System.out.print("For Deleting a File from Directory. \n Please Enter a File Name : ");
                    String filename = sc.next();
                    fo.DeleteFile(filename);
                    break;
                }
                   case '7' : {
                	System.out.println();
                    System.out.println("return to main menu");
                    Main_Menu();
                    break;
                }
                default : System.out.println("Please enter Otion 4, 5, 6 or 7");
            }
            Sub_Menu();
            sc.close();
        }
        catch (Exception e){
            System.out.println("Please enter Option 4, 5, 6 or 7");
            Sub_Menu();
        }
    }

}
