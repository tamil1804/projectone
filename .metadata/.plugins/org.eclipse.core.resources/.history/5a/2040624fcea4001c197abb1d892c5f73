package phaseoneproject;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LockedMe 
{
	  static final String projectFilesPath="D:\\phaseone project";
	  
		  public static void displayMenu() 
		 {
			System.out.println("*****************************************");
			System.out.println("\t Welcome to LockedMe.com secure app");
			System.out.println("\t Developed by :S.Tamil Arasan");
			System.out.println("*****************************************");
			System.out.println("\t1. Display all files");
			System.out.println("\t2. Add a new file");
			System.out.println("\t3. Delete a file");
			System.out.println("\t4. Search file ");
			System.out.println("\t5. Exit");
			System.out.println("*****************************************");
		 }
		   public static void getAllfile() 
		   {
			 File folder= new File(projectFilesPath);  
			 File[] listofFiles=folder.listFiles();
			 if(listofFiles.length>0)
			 {
				 System.out.println("Files Listed Below");
				  for(var l:listofFiles)
				  {
					  System.out.println(l.getName());
				  }
			 }
			  else
			  {
				  System.out.println("The Folder is Empty");
			  }
			
		   }
		   
		   public static void createFiles() 
		    {
			   try
			   {
				   Scanner obj=new Scanner(System.in);
				   String fileName;
				   System.out.println("Enter file name");
				   fileName=obj.nextLine();
				   
				   int linescount;
				   System.out.println("Enter how many lines in the file:");
				   linescount=Integer.parseInt(obj.nextLine());
				   FileWriter fw= new FileWriter(projectFilesPath+"\\"+fileName);
				   
				   for(int i=1;i<=linescount;i++)
				   {
					   System.out.println("Enter file line");
					   fw.write(obj.nextLine());
				   }
				   System.out.println("File created Successfully");
				   fw.close();
			   }
			   catch(Exception Ex)
			   {
				   
			   }
			
	        }
		    public static void deleteFiles() 
		    {
			
	        }
		    
		    public static void searchFiles() 
		    {
			
	        }
			public static void exit() {
				
				
			}
			
		   
	  
}
