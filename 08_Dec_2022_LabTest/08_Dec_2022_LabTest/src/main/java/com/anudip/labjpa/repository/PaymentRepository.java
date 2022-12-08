package com.anudip.labjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.labjpa.entity.Payment;

public interface PaymentRepository extends JpaRepository <Payment, Long> {

}
