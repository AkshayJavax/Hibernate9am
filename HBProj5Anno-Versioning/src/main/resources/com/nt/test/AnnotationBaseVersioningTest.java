package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.MobileInfo;
import com.nt.util.HibernateUtil;

public class AnnotationBaseVersioningTest {

	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		boolean flag=false;
		MobileInfo info=null;
		//get session
		ses=HibernateUtil.getSession();
		tx=ses.beginTransaction();
		info=new MobileInfo();
		info.setSerNo(102);
		info.setMobNo(8888775129l);
		info.setHolderName("Akshay");		
		try {
		     ses.save(info);
		     flag=true;
		
		}catch(HibernateException he) {
			he.printStackTrace();
			flag=false;
			}
		finally {
			if(flag) {
				tx.commit();
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
