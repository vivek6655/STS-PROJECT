package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

	
	public void makePayment() {
		
		System.out.println("Payment Debit");
	
		
	}

	public void makePayments(int id) {
		System.out.println("Payment Credit : "+id);
		
	}
	
	

}
