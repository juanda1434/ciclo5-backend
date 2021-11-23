package com.mintic.misiontic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "user_email",unique = true,length = 50,nullable = false)
	private String userEmail;
	
	@Column(name="user_name",nullable = false,length = 80)
	private String username;

	@Column(name="user_password",nullable = false,length = 50)
	private String password;
	
	
	
}
