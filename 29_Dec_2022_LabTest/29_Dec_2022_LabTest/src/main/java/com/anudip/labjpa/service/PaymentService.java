package com.anudip.labjpa.service;

import java.util.List;

import com.anudip.labjpa.entity.Payment;


public interface PaymentService {
	
	Payment savePayment(Payment pay);

	Payment getByIdPayment(long payid);

	List<Payment> getAllPayment();

	Payment updateByPayment(Payment pay, long payid);

	void deleteByIdPayment(long payid);

	Payment getPaymentByName(String cName);
	
	Payment getPaymentByPhone(long cPhone);
}