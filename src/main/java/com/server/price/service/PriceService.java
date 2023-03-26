package com.server.price.service;

import com.server.price.priceEntity.Price;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public class PriceService {
    public Price getPrice(String bookId) {
        BigDecimal max = new BigDecimal(100 + ".0");
        BigDecimal randFromDouble = new BigDecimal(Math.random());
        BigDecimal actualRandomDec = randFromDouble.add(new BigDecimal(95));

        return Price.builder().price(actualRandomDec).build();
    }
}
