package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Product;
import com.nt.util.HibernateUtil;

public class DeleteMethodTest {

	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		boolean flag=false;
		ses=HibernateUtil.getSession();
		Product prod=null;
		prod=new Product();
		prod=ses.get(Product.class, 101);
		try {
		ses.delete(prod);
		tx=ses.beginTransaction();
		flag=true;
		}catch(HibernateException he) {
			he.printStackTrace();
			flag=false;
		}
		finally {
			if(flag) {
				tx.commit();
				System.out.println("object deleted");
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
