package com.galaxe.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.galaxe.Pojo.Employee;


public class EmployeePersist {
	
	public static void main(String args[])
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		@SuppressWarnings("deprecation")
		SessionFactory factory=cfg.buildSessionFactory(); 
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();  
    
    Employee e1=new Employee();  
    e1.setId(116);  
    e1.setFirstName("sonoo");  
    e1.setLastName("jaiswal");  
      
    session.persist(e1);//persisting the object  
      
    t.commit();//transaction is committed  
    session.close();  
      
    System.out.println("successfully saved");  
	}
}
