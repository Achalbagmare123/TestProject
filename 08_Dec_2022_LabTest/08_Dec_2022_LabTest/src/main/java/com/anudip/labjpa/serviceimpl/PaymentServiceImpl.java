package com.anudip.labjpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.labjpa.entity.Payment;
import com.anudip.labjpa.exception.PaymentNotFoundException;
import com.anudip.labjpa.repository.PaymentRepository;
import com.anudip.labjpa.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	PaymentRepository payrepo;
	
	public Payment savePayment(Payment pay) {
		
		return payrepo.save (pay);
	}

	public Payment getByIdPayment(long payid) {
		return payrepo.findById(payid).orElseThrow(()-> new PaymentNotFoundException("Entered customer id doesnot exist in the system"));
	}

	
	public List<Payment> getAllPayment() {
		return payrepo.findAll();
	}

	
	public Payment updateByPayment (Payment pay, long payid) {
	Payment pay1=payrepo.findById(payid).orElseThrow(()-> new PaymentNotFoundException("Entered customer id doesnot exist in the system"));
		
	pay1.setCEmail(pay.getCEmail());
	pay1.setCPhone(pay.getCPhone());
	payrepo.save(pay1);
	return pay1;
	}

	
	public void deleteByIdPayment(long payid) {
		payrepo.findById(payid).orElseThrow(()-> new PaymentNotFoundException("Entered customer id doesnot exist in the system"));
		payrepo.deleteById(payid);
	}
	

}
