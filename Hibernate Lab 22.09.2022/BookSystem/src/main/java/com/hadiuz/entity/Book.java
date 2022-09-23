package com.hadiuz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "book_dtl")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@Id   // primary key
	@GeneratedValue(strategy = GenerationType.AUTO)    // auto increment 
	private int bid;
	
	@Column(length = 20,nullable = false)
	private String bname;
	
	@Column(length = 15,nullable = false)
	private String bauthor;
	
	@Column(length = 15,nullable = false)
	private double bprice;
	
	 
	
}