package com.nt.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
public static SessionFactory factory;
static {
	System.out.println("HibernateUtil.enclosing_method()");
	Configuration cfg=null;
	cfg=new Configuration();
	cfg.configure("com/nt/cfgs/employee.cfg.xml");
	factory=cfg.buildSessionFactory();
	
}
public static Session getSession() {
	System.out.println("HibernateUtil.getSession()");
	Session ses=null;
	ses=factory.openSession();
	return ses;
}
//close session object
public static void closeSession(Session ses) {
	ses.close();
}
public static void closeSessionFactory() {
	factory.close();
}
}
