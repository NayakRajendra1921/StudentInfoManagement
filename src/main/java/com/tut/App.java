package com.tut;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	//subject objects
    	Subject sub1=new Subject(001,"Physics");
    	Subject sub2=new Subject(762,"Chemistry");
    	Subject sub3=new Subject(431,"Maths");
    	Subject sub4=new Subject(331,"English");
    	Subject sub5=new Subject(891,"ComputerScience");
    	
    	StudentInfo stud1=new StudentInfo();
    	stud1.setRegid(5468);
    	stud1.setName("Aryan Sharma");
    	stud1.setFathersName("Abhinav Sharma");
    	stud1.setDob(new Date(2002,8,22));
    	List<Subject> subList=new ArrayList<Subject>();
    	subList.add(sub1);
    	subList.add(sub2);
    	subList.add(sub3);
    	subList.add(sub4);
    	stud1.setSubjectList(subList);
    	
    	PreviousYearResult prevResult=new PreviousYearResult(400,500,80.00);
    	
    	stud1.setPreviousYearResult(prevResult);
    	
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	
    	
    	tx.commit();
    	session.close();
    	
    	
    }
}
