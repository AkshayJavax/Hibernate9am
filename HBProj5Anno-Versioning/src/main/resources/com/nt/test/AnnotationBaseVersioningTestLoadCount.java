package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.MobileInfo;
import com.nt.util.HibernateUtil;

public class AnnotationBaseVersioningTestLoadCount {

	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		boolean flag=false;
		MobileInfo info=null;
		//get session
		ses=HibernateUtil.getSession();
		tx=ses.beginTransaction();
		//info=new MobileInfo();
		
		try {
		   info=ses.load(MobileInfo.class, 101);
		   info.setMobNo(8888773511l);
		     flag=true;
		
		}catch(HibernateException he) {
			he.printStackTrace();
			flag=false;
			}
		finally {
			if(flag) {
				tx.commit();
				System.out.println("the mob no modified "+info.getCount()+" times");
				System.out.println("object saved");
			}
			else if(flag=false) {
				tx.rollback();
				System.out.println("object not saved");
			}
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
	}

}
