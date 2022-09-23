package com.hadiuz;

import java.util.Scanner;

import com.hadiuz.daoimpl.BookDaoImpl;

public class App 
{     
    private static Scanner sc;

	public static void main( String[] args ) 
    {    
    	// creating a class object
        BookDaoImpl dao = new BookDaoImpl();
        char c;
        
        
        // using do-while loop to traversing the methods
        do {
        	sc = new Scanner(System.in);
        	System.out.println("------BOOK------");
        	// take user input
        	System.out.println("1.Add Book");
        	System.out.println("2.Fetch Book");
        	System.out.println("3.Exit");
        	 
        	// reading user input
        	int a = sc.nextInt();
        	// to get the method
        	switch(a) {
        	
        	// called method to add student data
        	case 1: dao.addBook();
        		break;
        	// called method to fetch student data
        	case 2: dao.fetchBook();
        		break;
        	 
        	case 3: 
        		System.out.println("Thank You.");
        		System.exit(0);
        		break;
        	// default case for invalid choice	
        	default: System.out.println("Invalid Choice!");
        	}
        	// to continue run the operation or not
        	System.out.println("Do you want to continue? Y/N");
        	c = sc.next().charAt(0);
        		
        // pass the condition to continue or not	
		} while (c == 'y' || c=='Y');
        System.out.println("Thank You.");
    }
}