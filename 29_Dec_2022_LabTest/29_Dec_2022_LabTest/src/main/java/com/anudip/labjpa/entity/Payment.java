package com.anudip.labjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PaymentInfo")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(length = 30, nullable = false)
	@NotBlank(message = "Enter your full name")
	private String cName;

	@Column(length = 30, nullable = false, unique = true)
	@Email(message = "Enter your proper email id")
	@NotBlank(message = "Enter your email id")
	private String cEmail;

	@Column(length = 10, nullable = false, unique = true)
	@NotNull(message = "Enter your phone number")
	private long cPhone;

	@Column(length = 30, nullable = false)
	@NotBlank(message = "Enter payment date")
	private String paymentDate;

	@Column(length = 11, nullable = false)
	@NotBlank(message = "Enter a proper amount")
	private long amount;
}