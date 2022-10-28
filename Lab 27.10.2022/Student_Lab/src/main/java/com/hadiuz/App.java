package com.hadiuz;

import javax.swing.JOptionPane;

import com.hadiuz.entity.Student;
import com.hadiuz.service.StudentService;
import com.hadiuz.serviceimpl.StudentServiceImpl;

public class App 
{
    public static void main( String[] args ) {
    	try {
    		//creating object of student service
    	       StudentService studentservice=new StudentServiceImpl();
    	       Student student=new Student();
    	       //set the value 
    	       student.setSId(Integer.parseInt(JOptionPane.showInputDialog("Enter Student ID")));
    	       student.setSName(JOptionPane.showInputDialog("Enter Student Name"));
    	       studentservice.addStudent(student);//calling method of service layer
		} catch (Exception e) {
			System.out.println("exception "+e);
		}
    
       
    }
}