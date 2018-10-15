package com.pranav.strategy;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ShoppingCartTest {

    /**
     * verify if the shopping cart uses the strategy during the payment
     */
    @Test
    public void testPaymentPay(){
        PaymentStrategy paymentStrategy = mock(PaymentStrategy.class);
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
        //given
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        //when
        shoppingCart.pay(paymentStrategy);
        //then
        verify(paymentStrategy).pay(anyInt());
        verifyNoMoreInteractions(paymentStrategy);
    }

    /**
     * verify if the shopping cart uses the new strategy during the payment
     */
    @Test
    public void testChangeStrategy(){
        PaymentStrategy initialPaymentStrategy = mock(PaymentStrategy.class);
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
        //given
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        //when
        shoppingCart.pay(initialPaymentStrategy);
        //then
        verify(initialPaymentStrategy).pay(anyInt());

        PaymentStrategy newPaymentStrategy = mock(PaymentStrategy.class);
        shoppingCart.pay(newPaymentStrategy);
        verify(newPaymentStrategy).pay(anyInt());

        verifyNoMoreInteractions(initialPaymentStrategy, newPaymentStrategy);



    }
}
