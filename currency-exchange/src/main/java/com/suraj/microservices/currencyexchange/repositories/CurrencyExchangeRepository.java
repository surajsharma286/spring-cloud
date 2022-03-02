package com.suraj.microservices.currencyexchange.repositories;

import com.suraj.microservices.currencyexchange.bean.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {

    CurrencyExchange findByCurrencyFromAndCurrencyTo(String currencyFrom,String currencyTo);
}
