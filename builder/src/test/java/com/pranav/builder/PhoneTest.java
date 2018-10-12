package com.pranav.builder;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PhoneTest {

    @Test
    public void testBuildPhone(){
         Phone phone = new PhoneBuilder()
                .setOs("Android")
                .setRam(2)
                .setBattery(3500)
                .setProcessor("Qualcomm")
                .setScreeSize(5.5).getPhone();
        assertNotNull(phone);
        assertNotNull(phone.toString());
    }
}
