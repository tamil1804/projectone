package phaseoneproject;

import java.util.Scanner;

public class ClientApp 
{
	private static final String breaK = null;

	public static void main(String arg[])
	{
		Scanner obj=new Scanner(System.in);
		int ch;
			do
			{
			 LockedMe.displayMenu();
			 System.out.println("Enter your choice:");
			 ch=Integer.parseInt(obj.nextLine());
			 
			 switch(ch)
			 {
			 case 1:LockedMe.getAllfile();
			 		break;
			 case 2:LockedMe.createFiles();
			  		break;
			 case 3:LockedMe.deleteFiles();
			 		break;
			 case 4:LockedMe.searchFiles();
		 			break;		
			 case 5:System.exit(0);
			 		break;
			 		
			 default:System.out.println("Indvalid option");			 
			 }
			} 
			while(ch>0);
			obj.next();
			obj.close();
			
			}
}
