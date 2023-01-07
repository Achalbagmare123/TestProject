package com.bank.sprint1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//importing all the annotation from lombok for getter,setter and constructor
@Getter
@Setter
@Data
@Entity
@Table(name = "login")// creates table in database
public class Login {

	// instance variable for login entity
	@Id
	private int uid;

	// creating columns for table login
	@Column(length = 10, nullable = false)
	private String userName;

	@Column(length = 8, nullable = false)
	private String password;

}
