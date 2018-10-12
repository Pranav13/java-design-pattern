package com.pranav.builder;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Shop {
    private static final Logger LOGGER = LoggerFactory.getLogger(Shop.class);

    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
        LOGGER.info(phone.toString());
    }
}
