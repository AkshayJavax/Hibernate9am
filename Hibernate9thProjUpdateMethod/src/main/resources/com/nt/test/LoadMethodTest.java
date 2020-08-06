package com.nt.test;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Product;
import com.nt.util.HibernateUtil;

public class LoadMethodTest {

	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		boolean flag=true;
		HibernateUtil util=null;
		 Product prod=null;
		ses=HibernateUtil.getSession();
		
		prod= ses.load(Product.class, 101);
		prod.setPrice(425.0f);
		System.out.println(prod);
		try {
		//ses.update(prod);
		tx=ses.beginTransaction();
		prod.setPname("door");
		flag=true;
		System.out.println("class name===>"+prod.getClass()+"  superclass name=====> "+prod.getClass().getSuperclass()+"    super interface====> "+Arrays.toString(prod.getClass().getInterfaces()));
		System.out.println(prod);
		util=new HibernateUtil();
		
		}catch(Exception e) {
			flag=false;
			e.printStackTrace();
		}
		finally {
			if(flag=true) {
				tx.commit();
				System.out.println("record updated");
				util.closedSession(ses);
				util.closeSessionFactory();
			}
			else if(flag=false) {
				tx.rollback();
				System.out.println("record not updated");
				util.closedSession(ses);
				util.closeSessionFactory();
			}
			
		}
	}

}
