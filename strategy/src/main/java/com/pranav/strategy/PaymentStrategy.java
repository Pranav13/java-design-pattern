package com.pranav.strategy;

@FunctionalInterface
public interface PaymentStrategy {
    public void pay(int amount);
}
