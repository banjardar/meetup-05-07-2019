package com.meetup.sleuth.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PaymentController {

	private static final Logger log = LoggerFactory.getLogger(PaymentController.class);

	@Autowired
	private RestTemplate template;

	@GetMapping("/payment")
	public String payment() {
		log.info("payment service called with discount....");
		int totalDiscount= template.getForObject("http://localhost:8081/getDiscount", Integer.class);
		return "Discount Available is" + totalDiscount;
	}


}
