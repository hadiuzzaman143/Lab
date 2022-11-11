package com.hadiuz.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hadiuz.student.entity.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
