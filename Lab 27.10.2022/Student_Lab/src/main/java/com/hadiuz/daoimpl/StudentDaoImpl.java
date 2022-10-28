package com.hadiuz.daoimpl;

import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hadiuz.config.HibernateUtil;
import com.hadiuz.dao.StudentDao;
import com.hadiuz.entity.Student;

public class StudentDaoImpl implements StudentDao{
	Session session =HibernateUtil.getSessionFactory().openSession();//creating session object
	//starting transaction
	Transaction t=session.beginTransaction();

	public void addStudent(Student student) {
		try {
			session.save(student);
			t.commit();
			session.close();
			JOptionPane.showMessageDialog(null, student.getSName()+ "'s data saved");
		} catch (HibernateException h) {
			System.out.println("Hibernate Exception "+h);//throw hibernate related exception
		}
		catch (Exception e) {
			System.out.println("General Exception "+e);//throw normal exception
		}
				
	}

}
