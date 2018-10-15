package com.pranav.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items ;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }

    public int calculateTotal() {
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void addItem(Item item) {
        this.items.add(item);

    }

    public void removeItem(Item item){
        this.items.remove(item);
    }
}
