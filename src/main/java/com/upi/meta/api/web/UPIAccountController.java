package com.upi.meta.api.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UPIAccountController {

	private static final Logger logger = LoggerFactory.getLogger(UPIAccountController.class);

	@GetMapping(path = "/upi/test")
	public ResponseEntity<Object> findByMobile() {
		try {
			logger.info("Request received for the UPI Test Service");
			return new ResponseEntity<>("Spring Boot application is deployed successfully!", HttpStatus.NOT_FOUND);
		} catch (Exception ex) {
			return new ResponseEntity<>(ex, HttpStatus.NOT_FOUND);
		}
	}
}
