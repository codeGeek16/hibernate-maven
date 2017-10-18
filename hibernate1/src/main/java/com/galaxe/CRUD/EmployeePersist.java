package com.galaxe.CRUD;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.galaxe.Pojo.Address;
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
    try{
    	Address add = new Address(3,"Kasumpati","Shimla","HP");
	    session.persist(add);
	    
	    Employee e1=new Employee(2,"Vikram","Bhandral",add);  
	    session.persist(e1);//persisting the object
	    
	    t.commit();//transaction is committed  
	    System.out.println("successfully saved");  
    }
    catch(HibernateException hex){
    	hex.printStackTrace();
    	t.rollback();
    }
    finally{
    	session.close();  
    }
 
    
      
   
	}
}
