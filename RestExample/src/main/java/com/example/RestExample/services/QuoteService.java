package com.example.RestExample.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.RestExample.controllers.UserController;
import com.example.RestExample.entities.Quote;

@Service
public class QuoteService {
	
	
    Logger logger = LoggerFactory.getLogger(QuoteService.class);

	
	private RestTemplate restTemplate = new RestTemplate();
	
	public Quote getQuote()
	{
		
		Quote quote = restTemplate.getForObject(
					"https://quoters.apps.pcfone.io/api/random", Quote.class);
		logger.info(quote.toString());
		return(quote);
		
	}

}
