package com.cloudnative.controller;

import java.math.BigDecimal;

public class CurrencyExchange {

	private long id;
	private String from;
	private String to;
	private BigDecimal multiple;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getMultiple() {
		return multiple;
	}

	public void setMultiple(BigDecimal multiple) {
		this.multiple = multiple;
	}

	public CurrencyExchange(long id, String from, String to, BigDecimal multiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.multiple = multiple;
	}

	public CurrencyExchange() {
		super();
	}

}
