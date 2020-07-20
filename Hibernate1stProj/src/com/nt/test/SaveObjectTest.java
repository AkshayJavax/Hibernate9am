package com.nt.test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Product;

public class SaveObjectTest {

	public static void main(String[] args) {
		Configuration cfg=null;
		Session ses=null;
		SessionFactory factory=null;
		Product prod=null;
		boolean flag;
		Transaction tx=null;
		//bootstrap the hibernate
		cfg=new Configuration();
		//load the configuration file
		cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
		//build session facory
		factory=cfg.buildSessionFactory();
		//create session object
		ses=factory.openSession();
		prod=new Product();
		prod.setPid(103); prod.setPname("Table"); prod.setPrice(2000); prod.setStockqty(2);  prod.setMfgdate(new Date(01-03-2012));
		prod.setExpirydate(new Date(12-12-2019));
		try {
			tx=ses.beginTransaction();
			ses.save(prod);
			flag=true;
		}//try
		catch(HibernateException e) {
			flag=false;
			e.printStackTrace();
			
		}//catch
		finally {
			if(flag=true) {
				tx.commit();
				System.out.println("object saved successfully");
				
			}
			else {
				tx.rollback();
				System.out.println("object not saved successfully");
			}
		}

	}//main

}//class
