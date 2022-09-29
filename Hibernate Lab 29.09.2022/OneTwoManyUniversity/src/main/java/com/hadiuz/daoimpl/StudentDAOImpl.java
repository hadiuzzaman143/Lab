package com.hadiuz.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.hadiuz.config.HibernateUtil;
import com.hadiuz.dao.StudentDAO;
import com.hadiuz.entity.University;

import jakarta.persistence.Query;

import com.hadiuz.entity.Student;

public class StudentDAOImpl implements StudentDAO {
	
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();

	@SuppressWarnings("deprecation")
	public void addStudent() 
	{
		University u =new University();
		u.setUname("MAKAUT,W.B");
		u.setUadd("kolkata");
		u.setUcollege("IMPS COLLEGE,MALDA");
		
		Student s =new Student();
		s.setSname("Hadiuz");
		s.setScity("Malda");
		s.setDepartment("CSE");
		s.setEmail("hadiuz@gmail.com");
		s.setCollege("IMPS COLLEGE,MALDA");
		
		Student s1=new Student();
		s1.setSname("Adi");
		s1.setScity("Kolkata");
		s1.setDepartment("Civil");
		s1.setEmail("adi@gmail.com");
		s1.setCollege("IMPS COLLEGE,MALDA");
		
		Student s2=new Student();
		s2.setSname("Sankhojit");
		s2.setScity("CB");
		s2.setDepartment("CSE");
		s2.setEmail("sankho@gmail.com");
		s2.setCollege("IMPS COLLEGE,MALDA");
		
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(s);
		a1.add(s1);
		a1.add(s2);
		u.setStudents(a1);
		
		session.save(u);
		t.commit();
		
		
	}

	public void fetchStudent() 
	{
		 
		Query q = session.createQuery("From University");
		// list with University entity
		List<University> al = q.getResultList();
		// traversing 
		Iterator<University> itr = al.iterator();
		while(itr.hasNext()) {
		// fetching the data
		University u1 = itr.next();
		System.out.println("-----------University Details-----------");
		System.out.println(u1.getUname()+" "+u1.getUadd()+" "+u1.getUcollege());
		}
		
		Query q1 = session.createQuery("From Student");
		// list with Student entity
		List<Student> al1 = q1.getResultList();
		// traversing 
		Iterator<Student> itr1 = al1.iterator();
		
		System.out.println("-----------Student Details-----------");
		while(itr1.hasNext()) {
		// fetching the data
		Student s = itr1.next();
		System.out.println(s.getSname()+" "+s.getScity()+" "+s.getEmail()+" "+s.getDepartment()+" "+s.getCollege());
		
		}  
		 
		
	}


	 


}
