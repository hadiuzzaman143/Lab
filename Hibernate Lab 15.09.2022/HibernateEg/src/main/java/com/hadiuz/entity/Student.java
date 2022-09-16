package com.hadiuz.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student_Details")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student 
{    
	// student class
	// taking variables 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 20, nullable = false)
	private String name;
	@Column(length = 11, nullable = false, unique = true)
	private long phone;
	@Column(length = 20, nullable = false)
	private String dept;
	@Column(length = 20, nullable = false, unique = true)
	private String email;
	  
}
