package com.nt.test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Product;
import com.nt.utility.HibernateUtility;

public class HibernateUtilityTest {

	public static void main(String[] args) {
		HibernateUtility util=null;
		Transaction tx=null;
		Product prod=null;
		boolean flag=false;
		
		Session ses=null;
		ses=util.getUtils();
	    prod=new Product();
	    prod.setPid(15);prod.setPname("chair"); prod.setPrice(500); prod.setStockqty(2);
	    prod.setMfgdate(new Date(21/11/1996));
	    prod.setExpirydate(new Date(13/8/2020));
	    try {
	    ses.save(prod);
	    tx=ses.beginTransaction();
	    flag=true;
	    }catch(HibernateException he) {
	    	flag=false;
	    	System.out.println("query problem");
	    }catch(Exception e) {
	    	flag=false;
	    	System.out.println("internal problem");
	    }
        finally {
        	if(flag=true) {
        		System.out.println("object saved");
        		tx.commit();
        	}
        	else {
        		System.out.println("object not saved");
        		tx.rollback();
        	}
        }
	}

}
