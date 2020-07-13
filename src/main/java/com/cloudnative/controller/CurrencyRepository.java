package com.cloudnative.controller;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<CurrencyExchange, Long> {

	Optional<CurrencyExchange> findByFromAndTo(String from, String to);

}
