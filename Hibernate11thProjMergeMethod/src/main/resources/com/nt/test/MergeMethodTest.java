package com.nt.test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Product;
import com.nt.util.HibernateUtil;

public class MergeMethodTest {

	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		boolean flag=false;
		ses=HibernateUtil.getSession();
		Product prod1=null,prod2=null;
		prod1=new Product();
		//prod=ses.get(Product.class, 101);
		prod1.setPid(1011);prod1.setPname("tab");prod1.setPrice(400);prod1.setMfgdate(new Date(21-11-1998));
		//prod.setExpirydate(new Date(03-12-2008));
		try {
		//ses.merge(prod);
         ses.merge(prod1);
          //System.out.println(prod2);
			tx=ses.beginTransaction();
		flag=true;
		}catch(HibernateException he) {
			he.printStackTrace();
			flag=false;
		}
		finally {
			if(flag) {
				tx.commit();
				System.out.println("object merged");
			}
			if(flag=false) {
				tx.rollback();
				System.out.println("rollback");
			}
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeFactory();
		}
	}

}
