package phaseoneproject;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe 
{
	  static final String projectFilesPath="D:\\phaseone project";
	  
	  /**
	   * This method will display the menu for end users
	   */
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
		  /**
		   * This method will retrieve all files
		   */
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
		   /**
		    * This method will read file details from user and creates files
		    */
		   
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
		     	try
		    	{
					 Scanner obj = new Scanner(System.in);
					 String fileName;
					 System.out.println("Enter file name to be deleted:");
					 fileName=obj.nextLine();
					 
					 File f= new File(projectFilesPath+"\\"+fileName);
					 
					 if(checkFileExists(fileName))
					 {
						 f.delete();
						 System.out.println("File delete successfully");
					 }
					 else
					 {
						 System.out.println("File doesnot exist");
						  
					 }
		    	}
		    
			    catch(Exception Ex)
			    {
			    	System.out.println("unable to delete file. please contan :admin@123.com");
			    	
			    }
		    }
		  
		    
		    
		    
		    public static void searchFiles() 
		    {
		    	try
		    	{
		    		Scanner obj= new Scanner(System.in);
		    		String fileName;
		    		System.out.println("Enter file name to be Searched:");
		    		fileName=obj.nextLine();
		    		
		    		if(checkFileExists(fileName))
		    		{
		    			System.out.println("File is available");
		    			
		    		}
		    		else
		    		{
		    			System.out.println("File is not available");
		    		}
		    		
		    		
		    	}
		    	catch(Exception Ex)
		    	{
		    		
		    	}
		    	
			
	        }
		    /**
		     * This method will take file name as parameters and checks if
		     * it is present in the project folder or not
		     * @param fileName String
		     * @return boolean 
		     */
	        
			public static boolean checkFileExists(String fileName)
			{
				ArrayList<String> allFilesNames= new ArrayList<String>();
				File folder= new File(projectFilesPath);  
				 File[] listofFiles=folder.listFiles();
				 if(listofFiles.length>0)
				 {
					for(var l:listofFiles)
					  {
						  allFilesNames.add(l.getName());
						  
					  }
				 }
				return allFilesNames.contains(fileName);
			}
			
			
		   
	  
}
