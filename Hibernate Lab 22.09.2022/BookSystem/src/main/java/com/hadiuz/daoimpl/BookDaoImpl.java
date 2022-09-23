package com.hadiuz.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hadiuz.config.HibernateUtil;
import com.hadiuz.dao.BookDAO;
import com.hadiuz.entity.Book;


public class BookDaoImpl implements BookDAO {

	@Override
	public void addBook() {
		// creating scanner class object
		Scanner scan = new Scanner(System.in);
		String name,author;
		double price;
		 
		
		// taking user input & read the user input
		System.out.print("Enter Book Name: ");
		name = scan.next();
		System.out.print("Enter Author Name: ");
		author = scan.next();
		System.out.print("Enter Book Pirce: ");
		price = scan.nextDouble();
		 
		// creating a employee class object
		Book book = new Book();
		// set values
		book.setBname(name);
		book.setBauthor(author);
		book.setBprice(price);
		 
		// mapping with entity classes
		Session session = HibernateUtil.makeSession();
		// transaction implementation
		Transaction t = session.beginTransaction();
		session.save(book);
		t.commit();		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchBook() 
	{
		
		try {
			// creating scanner class object
			Scanner s1 = new Scanner(System.in);
			int id;
			// taking user input
			System.out.println("Enter ID: ");
			// reading user input
			id = s1.nextInt();
			// create a object from HibernateUtil
			Session session = HibernateUtil.makeSession();
			Book b = session.get(Book.class, id);
			// fetch the data from selected table
			System.out.println("-------------- Book Data --------------");

			System.out.print("Book ID:        "+b.getBid());
			System.out.print("\n Book Name:   "+b.getBname());
			System.out.print("\n Book Author Name: "+b.getBauthor());
			System.out.print("\n Book Price:       "+b.getBprice());
			 	
		} catch (Exception e) {
			System.out.println("Data not found.");
		}
		
	}

}
