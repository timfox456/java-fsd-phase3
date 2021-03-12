package com.example.RestExample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestExample.entities.Quote;
import com.example.RestExample.services.QuoteService;

@RestController
public class QuoteController {


	@Autowired
	private QuoteService quoteService;
	
	@GetMapping("/quote")
	public @ResponseBody Quote getQuote() {
        // This returns a JSON or XML with the users
        return quoteService.getQuote();
    }
	
}
