package com.nt.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
public static SessionFactory factory=null;
static {
	System.out.println("HibernateUtility.enclosing_method()");
	Configuration cfg=null;
	//load the hibernate
	cfg=new Configuration();
	//load the configuration file
	cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
	//crate sessionfactory object by using configuration
	factory=cfg.buildSessionFactory();
}
public static Session getUtils() {
	System.out.println("HibernateUtility.getUtils()");
	Session ses=null;
	ses=factory.openSession();
	return ses;
}
}
