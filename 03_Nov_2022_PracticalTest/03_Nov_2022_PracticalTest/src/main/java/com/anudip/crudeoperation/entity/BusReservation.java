package com.anudip.crudeoperation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "busreservation_details")

public class BusReservation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busId;
	
	@Column(length = 30, nullable = false)
	private String busType;
	
	@Column(length = 30, nullable = false)
	private int numberOfSeats;
	
	@Column(length = 30, nullable = false)
	private String busSourceCity;
	
	@Column(length = 30, nullable = false)
	private String busDestinationCity;

}
