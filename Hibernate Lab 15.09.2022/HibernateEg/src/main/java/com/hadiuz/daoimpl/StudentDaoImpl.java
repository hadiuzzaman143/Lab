package com.hadiuz.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hadiuz.config.HibernateUtil;
import com.hadiuz.dao.StudentDAO;
import com.hadiuz.entity.Student;

public class StudentDaoImpl implements StudentDAO 
{     
	
	@Override
	public void addStudent() 
	{      
		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		String n;
		String d;
		String e;
		long p;
		// taking user input & read the user input
		System.out.println("Enter Name: ");
		n = sc.nextLine();
		System.out.println("Enter Dept: ");
		d = sc.nextLine();
		System.out.println("Enter Email: ");
		e = sc.nextLine();
		System.out.println("Enter Phone: ");
		p = sc.nextLong();
		// creating a student class object
		Student s = new Student();
		// set values
		s.setName(n);
		s.setDept(d);
		s.setEmail(e);
		s.setPhone(p);
		// mapping with entity classes
		Session session = HibernateUtil.makeSession();
		// transaction implementation
		Transaction t = session.beginTransaction();
		session.save(s);
		t.commit();
		
	}

	@Override
	public void deleteStudent() 
	{           
		// creating a scanner class object
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		
		// create a object from HibernateUtil
		Session session = HibernateUtil.makeSession();
		// transaction implementation
		Transaction t = session.beginTransaction();
		// given entity class with the given identifier
		Student std1 = session.get(Student.class, id);
		// to remove data from table 
		session.delete(std1);
		System.out.println("Deleted Succesfully.");
		// commit the statement
		t.commit();
		
	}

	@Override
	public void updateStudent() 
	{      
		// creating a scanner class object
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		
		// create a object from HibernateUtil
		Session session = HibernateUtil.makeSession();
		// transaction implementation
		Transaction t = session.beginTransaction();
		// given entity class with the given identifier
		Student std = session.get(Student.class, id);
		// taking user input
		System.out.println("Enter Phone Number: ");
		long phone = sc.nextLong();
		std.setPhone(phone);
		// update & commit the session
		session.update(std);
		t.commit();
		
		
	}

	@Override
	public void fetchStudent() 
	{        
		// creating scanner class object
		Scanner s1 = new Scanner(System.in);
		int id;
		// taking user input
		System.out.println("Enter ID: ");
		// reading user input
		id = s1.nextInt();
		// create a object from HibernateUtil
		Session session = HibernateUtil.makeSession();
		Student std = session.get(Student.class, id);
		// fetch the data from selected table
		System.out.println("----------- Student Data -----------");
		System.out.println(std.getName()+" "+std.getDept()+" "+std.getEmail()+" "+std.getPhone());
			
		
	}
}