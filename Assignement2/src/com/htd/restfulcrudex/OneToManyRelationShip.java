package com.htd.restfulcrudex;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class OneToManyRelationShip {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        SessionFactory factory=new  Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
         Session session = factory.openSession();
         Transaction tx= session.beginTransaction();
         
         // Process to execute the Query         
         Courses c1=new Courses();
         c1.setCourseName("ECE");
         c1.setFees(80000);
         Courses c2=new Courses();
         c2.setCourseName("CSE");
         c2.setFees(120000);
         List<Courses> fees = new ArrayList<Courses>();
         fees.add(c2);
         fees.add(c1);
         Student student=new Student();
         student.setStudentName("Rajkumar");
         student.setStudentContact(89194);
         student.setStudentAddress("Plvd");
         session.save(c1);
         session.save(c2);
         session.save(student);
         tx.commit();  // Saving Object Permanently ans closing session
         factory.close(); // closing very expensive connection
    }
 
}
