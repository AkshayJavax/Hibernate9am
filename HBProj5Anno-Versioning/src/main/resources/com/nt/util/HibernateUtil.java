package com.nt.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
public static SessionFactory factory;
static {
	Configuration cfg=null;
	cfg=new Configuration();
	cfg.configure("com/nt/cfgs/hbm.cfg.xml");
	factory=cfg.buildSessionFactory();
}
public static Session getSession() {
	Session ses=null;
	ses=factory.openSession();
	return ses;
}
public static void closeSession(Session ses) {
	ses.close();
}
public static void closeSessionFactory() {
	factory.close();
}
}
