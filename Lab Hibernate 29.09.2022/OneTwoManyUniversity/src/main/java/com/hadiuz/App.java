package com.hadiuz;

import com.hadiuz.daoimpl.StudentDAOImpl;

public class App 
{
	 
    public static void main( String[] args )
    {
    	StudentDAOImpl dt=new StudentDAOImpl();
        dt.addStudent(); 
        dt.fetchStudent();
    }    
}  	 
       	