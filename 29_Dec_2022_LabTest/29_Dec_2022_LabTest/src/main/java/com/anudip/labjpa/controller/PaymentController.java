package com.anudip.labjpa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.labjpa.entity.Payment;
import com.anudip.labjpa.service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	private PaymentService pays;

	@PostMapping("/savepay")
	public ResponseEntity<Payment> savepay(@Valid @RequestBody Payment payment) {
		return new ResponseEntity<Payment>(pays.savePayment(payment), HttpStatus.CREATED);
	}

	@GetMapping("/getpay/{payid}")
	public ResponseEntity<Payment> getpay(@PathVariable("payid") long payid) {
		return new ResponseEntity<Payment>(pays.getByIdPayment(payid), HttpStatus.OK);
	}

	@PutMapping("/updatepay/{payid}")
	public ResponseEntity<Payment> updatepay(@PathVariable("payid") long payid, @RequestBody Payment payment) {
		return new ResponseEntity<Payment>(pays.updateByPayment(payment, payid), HttpStatus.OK);

	}

	@DeleteMapping("delete/{payid}")
	public ResponseEntity<String> deletepay(@PathVariable("payid") long payid) {
		pays.deleteByIdPayment(payid);
		return new ResponseEntity<String>("successfully delete", HttpStatus.OK);
	}

	@GetMapping("/gett")
	public List<Payment> getAllPay() {
		return pays.getAllPayment();
	}

	@GetMapping("/getpbyname/{cname}")
	public ResponseEntity<Payment>getPbyname(@PathVariable("cname") String cName){
		return new ResponseEntity<Payment>(pays.getPaymentByName(cName), HttpStatus.OK);
	}
	
	@GetMapping("/getpbyphone/{cphone}")
	public ResponseEntity<Payment>getPbyphone(@PathVariable("cphone") long cPhone){
		return new ResponseEntity<Payment>(pays.getPaymentByPhone(cPhone),HttpStatus.OK);
	}
}