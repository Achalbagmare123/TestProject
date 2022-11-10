package com.anudip.labtest.entity;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int cid;
		
		@Column(length = 30, nullable = false)
		private String cname;
		
		
		@Column(length = 11, nullable = false, unique = true)
		private long phone;

	    @OneToOne(targetEntity = Book.class, cascade = CascadeType.ALL )
		private Book book;
	}