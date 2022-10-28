package com.hadiuz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
//entity class
public class Student {
	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sId;
	@Column(length = 30,nullable = false)
	private String sName;
}//end of class
