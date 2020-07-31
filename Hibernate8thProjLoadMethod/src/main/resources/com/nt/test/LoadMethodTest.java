package com.nt.test;

import java.util.Arrays;

import org.hibernate.Session;

import com.nt.entity.IProduct;
import com.nt.entity.Product;
import com.nt.util.HibernateUtil;

public class LoadMethodTest {

	public static void main(String[] args) {
		Session ses=null;
		HibernateUtil util=null;
		 IProduct prod=null;
		ses=HibernateUtil.getSession();
		
		prod= ses.load(Product.class, 101);
		System.out.println("class name===>"+prod.getClass()+"  superclass name=====> "+prod.getClass().getSuperclass()+"    super interface====> "+Arrays.toString(prod.getClass().getInterfaces()));
		//System.out.println(prod.getPname());
		util=new HibernateUtil();
		util.closedSession(ses);
		util.closeSessionFactory();
		
	}

}
