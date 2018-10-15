package com.pranav.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaypalStrategy implements PaymentStrategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaypalStrategy.class);

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    @Override
    public void pay(int amount) {
        LOGGER.info(amount +" paid using Paypal.");
    }

}
