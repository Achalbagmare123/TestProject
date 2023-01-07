package com.bank.sprint1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//importing all the annotation from lombok for getter,setter and constructor
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Transaction_Info") // creates table in database
public class Transaction {

	// instance variable for BankTransactions entity
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String transactionId;

	// creating columns for table bank_transactions
	@Column(length = 20, nullable = false)
	@NotBlank(message = "Enter your transaction type")
	private String transactionType;

	@Column(length = 10, nullable = false, unique = true)
	@NotBlank(message = "Enter your date of transaction")
	private String dateOfTransaction;

	@Column(length = 10, nullable = false, unique = true)
	@NotNull(message = "Enter your transaction amount")
	private long transactionAmount;

	@Column(length = 10, nullable = false, unique = true)
	@NotNull(message = "Enter your current balance")
	private long currentBalance;

	// this stores transaction Detail using many to one mapping relationship
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "customerID", referencedColumnName = "customerId")
	@JsonBackReference
	private Customer customer;
}
