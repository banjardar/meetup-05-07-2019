package com.meetup.sleuth.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

	private static final Logger log = LoggerFactory.getLogger(StoreController.class);
	
	@GetMapping("/getStoreDiscount")
	public int discount() {
		log.info("Store Discount service called....");
		return 20;
	}
}
