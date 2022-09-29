package com.hadiuz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Student  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	@Column(length = 20,nullable = false)
	private String sname;
	@Column(length = 20,nullable = false)
	private String scity;
	@Column(length = 6,nullable = false)
	private String department;
	@Column(length = 20,nullable = false)
	private String email;
	@Column(length = 45,nullable = false)
	private String college;
}
