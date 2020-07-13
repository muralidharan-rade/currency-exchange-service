package com.cloudnative.controller;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment env;
	@Autowired
	private CurrencyExchangeDAO dao;

	@GetMapping(path = "/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange getCurrencyExchange(@PathVariable String from, @PathVariable String to) {
		Optional<CurrencyExchange> exchange = dao.getCurrencyExchange(from, to);
		
		CurrencyExchange exchangeValue = null;
		if (exchange.isPresent()) {
			exchangeValue = exchange.get();
			exchangeValue.setPort(env.getProperty("local.server.port"));
		}
		return exchangeValue;
	}

}
