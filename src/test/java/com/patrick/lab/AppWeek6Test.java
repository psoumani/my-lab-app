package com.patrick.lab;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class AppWeek6Test {

    @Test
    public void shouldReturnItemTotalPrice() {
        ProductItem nP1 = new ProductItem("Watermelon", 4.00, 1);
        assertEquals(4.0, nP1.itemTotalPrice(nP1.name, nP1.price, nP1.quantity), 0.00);
        
    }

    @Test
    public void shouldReturnOrderTotal() {
        ProductItem nP2 = new ProductItem("Bag of strawberries", 6.00, 2);
        ProductItem nP3 = new ProductItem("Watermelon", 4.00, 1);

        ArrayList<String> nameArray = new ArrayList<>();
        ArrayList<Double> priceArray = new ArrayList<>();
        ArrayList<Integer> quantityArray = new ArrayList<>();

        priceArray.add(nP2.price);
        priceArray.add(nP3.price);
        quantityArray.add(nP2.quantity);
        quantityArray.add(nP3.quantity);

        Order nOrder = new Order(nameArray, quantityArray, priceArray);

        assertEquals(16.00, nOrder.orderTotalPrice(quantityArray, priceArray), 0.00);

    }
    
}
