package Driver.CovidRegistry;

import java.util.Scanner;

import Backend.BackEndOperations;
import Backend.DataSetter;
import Entities.Patients;

public class App 
{
      public static void main( String[] args )
       {
        Patients p=new Patients();
        BackEndOperations bo=new BackEndOperations();
              //Start setting the data...... 
          DataSetter  ds=new DataSetter(); 
          
   while(true)
       {
	   int choice;
	   Scanner k=new Scanner( System.in );  
	   System.out.println("Enter The choice\n1)Admit Patient\n2)Depart patient");
  	  
	   choice = k.nextInt();
  	  
   	   switch(choice)
    	   {
 	   case 1:
 		     p=ds.setPatientData();
 		     bo.SaveData(p);
 		     break;
 	   case 2: 
 		   String id;
 		   System.out.println("Enter the Id of the patient which is departing");
 		   
 		   k.nextLine();
 		   id=k.nextLine();
 		   bo.UpdateEntry(id);
 		   break;
 		 
 	   default:
 		   System.out.println("Select the coorect option\n");
 		   break;
    		   
  	   }
     }
     
}  
//    public static void main( String[] args )
//    {
//        Scanner kaif=new Scanner( System.in ); 
//  	  int mon ,day;
//         mon=kaif.nextInt();
//         kaif.nextLine();
//         day=kaif.nextInt();
//         System.out.println(mon);
//         System.out.println(day);
//         
//    }
    
    
}
