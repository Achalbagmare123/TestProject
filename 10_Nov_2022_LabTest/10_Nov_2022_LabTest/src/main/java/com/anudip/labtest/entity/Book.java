package com.anudip.labtest.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Book {
	@Id
	private long bookid;
	
	@Column(length = 30, nullable = false)
	private String bookname; 
	
	@Column(length = 50, nullable = false)
	private String type;
	
	@Column(length = 30, nullable = false)
	private String author;
	
	
 
}



