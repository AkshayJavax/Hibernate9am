package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Employee;
import com.nt.util.HibernateUtil;

public class GenerateTableTest {

	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		Employee emp1=null,emp2=null;
		boolean flag=false;
		emp1=new Employee();
		ses=HibernateUtil.getSession();
		emp1.setEno(101);emp1.setEname("Raja");emp1.setDesg("java"); emp1.setEadd("Hyd");
		emp1.setSalary(50000);
		try {
			emp2=(Employee)ses.merge(emp1);
			tx=ses.beginTransaction();
			flag=true;
		}catch(Exception e) {
			flag=false;
			e.printStackTrace();
		}
      finally {
    	  if(flag) {
    		  tx.commit();
    		  System.out.println("Table created and values are stored");
    	  }
    	  if(flag=false) {
    		  tx.rollback();
    		  System.out.println("table not created");
    	  }
    	  HibernateUtil.closeSession(ses);
    	  HibernateUtil.closeSessionFactory();
      }
	}

}
