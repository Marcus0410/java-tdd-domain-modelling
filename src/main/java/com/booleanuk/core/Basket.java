package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    private HashMap<String, Integer> items;

    public Basket() {
        items = new HashMap<>();
    }

    boolean add(String product, int price) {
        if (items.containsKey(product))
            return false;

        items.put(product, price);
        return true;
    }
}
