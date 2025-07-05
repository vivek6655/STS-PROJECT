package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/payment")
	public String getPayment() {
		paymentService.makePayment();
		return "Success";
	}

	@GetMapping("/payments/{id}")
	public String getPayments(@PathVariable int id) {
		paymentService.makePayments(id);
		return "Success";
	}
	
}
