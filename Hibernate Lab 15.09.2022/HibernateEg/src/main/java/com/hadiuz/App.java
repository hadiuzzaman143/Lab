package com.hadiuz;

import java.util.Scanner;

import com.hadiuz.daoimpl.StudentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        StudentDaoImpl dao = new StudentDaoImpl();
        do {
        	Scanner scan = new Scanner(System.in);
        	System.out.println("1.Add Student Data ");
        	System.out.println("2.Fetch Stdent Data ");
        	int a = scan.nextInt();
        	switch(a) {
        	
        	case 1: dao.addStudent();
        		break;
        	case 2: dao.fetchStudent();
        		break;
        	}
        	
		} while (true);
    }
}