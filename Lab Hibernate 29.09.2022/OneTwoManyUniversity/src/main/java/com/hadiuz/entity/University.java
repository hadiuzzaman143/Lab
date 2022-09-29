package com.hadiuz.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class University{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	@Column(length = 35,nullable = false)
	private String uname;
	@Column(length = 15,nullable = false)
	private String uadd;
	@Column(length = 45,nullable = false)
	private String ucollege;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="uid")
	private List<Student>students;
	  
}
