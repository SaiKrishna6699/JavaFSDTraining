package VirtualKey;

import java.util.*;
import java.io.*;

public class FileOperations {
	
	static String DIRECTORY;
	File folder_name;
	
	public FileOperations() {
        DIRECTORY = System.getProperty("user.dir");
        folder_name = new File(DIRECTORY+"/files");
        if (!folder_name.exists())
            folder_name.mkdirs();
        System.out.println("Directory : "+ folder_name.getAbsolutePath());
    }
	
	void SortingFiles() {
        if (folder_name.list().length==0)
            System.out.println(" Folder is Empty \n Add Some Files");
        else {
            String[] list = folder_name.list();
            System.out.println(" Files in "+ folder_name +" are :");
            Arrays.sort(list);
            for (String str:list) {
                System.out.println(str);
            }
        }
	}
	void AddFile(String filename) throws IOException {
        File filepath = new File(folder_name +"/"+filename);
        String[] list = folder_name.list();
        for (String file: list) {
            if (filename.equalsIgnoreCase(file)) {
                System.out.println("File " + filename + " is already exists at " + folder_name);
                return;
            }
        }
        filepath.createNewFile();
        System.out.println("File "+filename+"is added to "+ folder_name+" Successfully");
    }

    void DeleteFile(String filename) {
        File filepath = new File(folder_name +"/"+filename);
        String[] list = folder_name.list();
        for (String file: list) {
            if (filename.equals(file) && filepath.delete()) {
                System.out.println("File " + filename + " deleted from " + folder_name);
                return;
            }
        }
        System.out.println("Delete Operation failed. FILE NOT FOUND");
    }

    void SearchFile(String filename) {
        String[] list = folder_name.list();
        for (String file: list) {
            if (filename.equals(file)) {
                System.out.println("FOUND : File " + filename + " Exists at " + folder_name);
                return;
            }
        }
        System.out.println("File not found");
    }
	
}
