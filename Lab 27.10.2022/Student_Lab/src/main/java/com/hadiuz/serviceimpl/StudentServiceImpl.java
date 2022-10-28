package com.hadiuz.serviceimpl;

import com.hadiuz.dao.StudentDao;
import com.hadiuz.daoimpl.StudentDaoImpl;
import com.hadiuz.entity.Student;
import com.hadiuz.service.StudentService;

public class StudentServiceImpl implements StudentService {
		StudentDao studentdao=new StudentDaoImpl();
			
			
	public void addStudent(Student student) {
		studentdao.addStudent(student);//calling addstudent method of daoLayer
		
	}

}
