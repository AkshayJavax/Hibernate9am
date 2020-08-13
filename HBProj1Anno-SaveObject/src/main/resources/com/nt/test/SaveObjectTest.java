package com.nt.test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Product;
import com.nt.util.HibernateUtil;

public class SaveObjectTest {

	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		boolean flag=false;
		Product prod=null;
		prod=new Product();
		prod.setPid(1433);prod.setPname("book");prod.setPrice(200);
		prod.setMfgDate(new Date(21-11-1996));prod.setExpiryDate(new Date(21-12-2009));
		ses=HibernateUtil.getSession();
		try {
			ses.save(prod);
			tx=ses.beginTransaction();
			flag=true;
		}
catch(HibernateException he) {
	flag=false;
	he.getMessage();
}
		finally {
			if(flag) {
				tx.commit();
				System.out.println("object saved");
			}
			if(flag=false) {
				System.out.println("object not saved");
				tx.rollback();
				
			}
		}
	}

}
