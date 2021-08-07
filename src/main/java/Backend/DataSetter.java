package Backend;

import java.util.Date;
import java.util.Scanner;

import Entities.Patients;

public class DataSetter {
	
	public Patients setPatientData()
	{
		Patients p= new Patients();
		Scanner kaif =new Scanner(System.in);
		String temp;
		String id;
	    Date date = new Date();
	   
		
	    
	    
	    System.out.println("Enter the patient id");
	    id=kaif.nextLine();
	    p.setPat_id(id);
	    
	    System.out.println("Enter the patients name");
	    temp= kaif.nextLine(  );
	    p.setPat_name( temp );
	    
	    System.out.println("Enter the bed allocated to this patient");
	    temp=kaif.nextLine();
	    p.setBed_No(temp);
	    
	    p.setArrival_Date(date);
	    p.setDepart_Date( date ) ;
	    return p; 
	}

}
