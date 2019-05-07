package com.meetup.sleuth.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DiscountController {

	private static final Logger log = LoggerFactory.getLogger(DiscountController.class);

	@Autowired
	private RestTemplate template;

	@GetMapping("/getDiscount")
	public int discount() {
		log.info("discount service called....");
		int seasonalDiscount = 25;
		Integer storeDiscount = template.getForObject("http://localhost:8082/getStoreDiscount", Integer.class);
		return seasonalDiscount + storeDiscount;
	}
}
