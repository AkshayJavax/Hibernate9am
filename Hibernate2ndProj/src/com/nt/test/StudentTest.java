package com.nt.test;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.StudentDTO;

public class StudentTest {

	public static void main(String[] args) {
	  Configuration conf=null;
	  SessionFactory factory=null;
	  Session ses=null;
	  Transaction tx=null;
	  StudentDTO dto=null;
	  boolean flag=true;
	  int no,m1,m2,m3=0;
	  String name=null;
	  dto=new StudentDTO();
	  
	  //bootstrap the hibernate
	  conf=new Configuration();
	  conf.configure("com/nt/cfgs/hibernate.cfg.xml");
	  //build session factory object
	  factory=conf.buildSessionFactory();
	  ses=factory.openSession();
	  Scanner sc=null;
	  sc=new Scanner(System.in);
	  System.out.println("enter roll no");
	  no=sc.nextInt();
	  dto.setSno(no); 
	  System.out.println("enter your student name");
	  name=sc.next();
	  dto.setSname(name);
	  System.out.println("enter 3 subjects marks");
	  m1=sc.nextInt();
	  m2=sc.nextInt();
	  m3=sc.nextInt();
	  dto.setM1(m1);
	  dto.setM2(m2);
	  dto.setM3(m3);
	  dto.saveData(name);
	  try {
		  //get session object using factory
		  
		  tx=ses.beginTransaction();
		  ses.save(dto);
		  flag=true;
	  }//try
	  catch(HibernateException he) {
		  flag=false;
		 // he.printStackTrace();
		  
	  }//catch
	  finally {
		    if(flag=true) {
		    	tx.commit();
		    	System.out.println("object saved sucessfully");
		    }
		    else if(flag=false) {
		    	tx.rollback();
		    	System.out.println("object not saved sucessfully");
		    }
		    else {
		    	System.out.println("Internal problem...");
		    }
	  }//finally

	}//main

}//class
