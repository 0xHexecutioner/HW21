package sample;

import java.io.File;

public class main {

	 public static void main(String[] args) {
	        
	        listDirectories("C:\\Users\\danii\\OneDrive\\Images"); 
	 }
    public static void listDirectories(String path) {
        File dir = new File(path);

       
        if (dir.isDirectory()) {
            
            File[] files = dir.listFiles();
            
           
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println(file.getName());
                    }
                }
            }
        } else {
            System.out.println("The specified path is not a directory.");
        }
    }
}
	 

    
