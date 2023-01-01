package com.anudip.labjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anudip.labjpa.entity.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Long> {

	@Query("Select p from Payment p where p.cName=?1")
	Payment getPaymentByName(String cName);
	
	@Query("Select p from Payment p where p.cPhone=?1")
	Payment getPaymentByPhone(long cPhone);
}