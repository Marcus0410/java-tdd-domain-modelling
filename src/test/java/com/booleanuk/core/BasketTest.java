package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test    
    void testAddNonExistingItem() {
        Basket basket = new Basket();
        String itemName = "orange";
        int price = 5;

        Assertions.assertTrue(basket.add(itemName, price));
    }

    @Test    
    void testAddExistingItem() {
        Basket basket = new Basket();
        String itemName = "orange";
        int price = 5;

        basket.add(itemName, price);
        
        Assertions.assertFalse(basket.add(itemName, price));
    }
}
