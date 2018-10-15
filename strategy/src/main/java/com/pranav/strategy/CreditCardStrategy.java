package com.pranav.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCardStrategy implements  PaymentStrategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreditCardStrategy.class);

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }
    @Override
    public void pay(int amount) {
        LOGGER.info(amount +" paid with credit/debit card");
    }
}
