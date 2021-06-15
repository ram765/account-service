package com.account.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@GetMapping("/get")
	public String getMethod() {
		return "HELLO ACCOUNT SERVICE";
	}

}
