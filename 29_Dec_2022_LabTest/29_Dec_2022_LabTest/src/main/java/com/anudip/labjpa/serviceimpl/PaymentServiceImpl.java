package com.anudip.labjpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.labjpa.entity.Payment;
import com.anudip.labjpa.exception.PaymentNotFoundException;
import com.anudip.labjpa.repository.PaymentRepository;
import com.anudip.labjpa.service.PaymentService;


@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepository payrepo;

	@Override
	public Payment savePayment(Payment pay) {
		return payrepo.save(pay);
	}

	@Override
	public Payment getByIdPayment(long payid) {
		return payrepo.findById(payid)
				.orElseThrow(() -> new PaymentNotFoundException("Entered customer id doesnot exist in the system"));
	}
	
	@Override
	public List<Payment> getAllPayment() {
		return payrepo.findAll();
	}

	@Override
	public Payment updateByPayment(Payment pay, long payid) {
		Payment pay1 = payrepo.findById(payid)
				.orElseThrow(() -> new PaymentNotFoundException("Entered customer id doesnot exist in the system"));

		pay1.setCEmail(pay.getCEmail());
		pay1.setCPhone(pay.getCPhone());
		payrepo.save(pay1);
		return pay1;
	}

	@Override
	public void deleteByIdPayment(long payid) {
		payrepo.findById(payid)
				.orElseThrow(() -> new PaymentNotFoundException("Entered customer id doesnot exist in the system"));
		payrepo.deleteById(payid);
	}

	@Override
	public Payment getPaymentByName(String cName) {
		// TODO Auto-generated method stub
		return payrepo.getPaymentByName(cName);
	}

	@Override
	public Payment getPaymentByPhone(long cPhone) {
		// TODO Auto-generated method stub
		return payrepo.getPaymentByPhone(cPhone);
	}
}