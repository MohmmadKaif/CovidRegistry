package Backend;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Entities.Patients;

public class BackEndOperations 
{
	private Configuration con;
    private SessionFactory SF;
    private Session  session  ;
    private Transaction tx;
    
      
    public void SaveData(Patients p) 
    {
    	 con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Entities.Patients.class);	
    	 SF=con.buildSessionFactory();
         session=SF.openSession();
         tx=session.beginTransaction();
         session.save(p);
         
         tx.commit();
         session.close();
    }
	
    public void UpdateEntry(String id)
    {
    	
    	 Date date = new Date(); 
    	 con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Patients.class);	
         SF=con.buildSessionFactory();
         session=SF.openSession();
         Patients p= session.load(Patients.class, id);
         
        
         p.setDepart_Date(date);
         Date d=p.getDepart_Date();
         
         
         //p.setPat_name("Amit Shah");
         session.saveOrUpdate(p);
         session.beginTransaction().commit();
         session.close();
        
        
    }

}
