package com.cloudnative.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CurrencyExchangeDAO {

	@Autowired
	private CurrencyRepository repo;

	public Optional<CurrencyExchange> getCurrencyExchange(String from, String to) {
		return repo.findByFromAndTo(from, to);
	}

}
