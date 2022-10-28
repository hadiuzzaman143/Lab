package com.jdbc.students;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import com.jdbc.connection.Constd;


public class Students 
{
	public static void main(String[] args) 
	{
		//creating scanner class object
	     Scanner sc = new Scanner (System.in);
	     //taking user input
		System.out.println("Enter Student Id:");
		int sId=sc.nextInt();
		System.out.println("Enter Student name:");
		String sName=sc.next();
		
		try {
			//Creating connection
		Connection con= Constd.con();  
			PreparedStatement stm; 
		String sql="insert into student values(?,?)";
		stm = con.prepareStatement(sql);//preparing connection
		stm.setInt(1, sId );//set the value
		stm.setString(2, sName);//set the value
		
        stm.execute();//execute the query
		con.close();//close the connection
		  System.out.println("value inserted successfully");
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
			
	}//end of main method
	
}//end of class

