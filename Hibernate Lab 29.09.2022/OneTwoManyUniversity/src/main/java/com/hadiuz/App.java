package com.hadiuz;

import com.hadiuz.daoimpl.UniversityDAOImpl;

public class App 
{
	 
    public static void main( String[] args )
    {
    	UniversityDAOImpl dt=new UniversityDAOImpl();
        dt.addStudent(); 
        dt.fetchStudent();
    }    
}  	 
       	