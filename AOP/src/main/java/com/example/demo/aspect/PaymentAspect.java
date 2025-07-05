package com.example.demo.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PaymentAspect {
	
	Logger LOGGER = LoggerFactory.getLogger(PaymentAspect.class);
	
	@Before("execution(* com.example.demo.service.PaymentService.makePayment(..))")
	public void loggingAdvice(JoinPoint joinPoint) {
	    System.out.println("Payment started....");
	}

	@Before("execution(* com.example.demo.service.PaymentService.makePayments(..))")
	public void loggingAdvices(JoinPoint joinPoint) {
	    System.out.println("Payment started for credit card....");
	}
	
	@After("execution(* com.example.demo.service.PaymentService.makePayments(..))")
	public void loggingAdvicess(JoinPoint joinPoint) {
		LOGGER.info("hello......");
	    System.out.println("Payment started for credit card....");
	}
	
	
	
	
}
