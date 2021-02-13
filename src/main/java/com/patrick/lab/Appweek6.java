package com.patrick.lab;

import java.util.ArrayList;

public class Appweek6 {
    
    public static void main(String[] args) {
        
        //List of products available
        ProductItem P1 = new ProductItem("Bag of oranges", 5.99, 1);
        ProductItem P2 = new ProductItem("Bag of strawberries", 6.00, 1);
        ProductItem P3 = new ProductItem("Watermelon", 4.00, 1);
        ProductItem P4 = new ProductItem("Mangoe", 2.50, 1);

        //Total price of oreder of a specidifc product
        P1.itemTotalPrice("Bag of oranges", 5.99, 3);
        P2.itemTotalPrice("Watermelon", 4.00, 3);

        //List of different products in a specific order
        ArrayList<String> nameArray = new ArrayList<>();
        nameArray.add(P1.name);
        nameArray.add(P2.name);
        nameArray.add(P3.name);
        nameArray.add(P4.name);
        
        ArrayList<Double> priceArray = new ArrayList<>();
        priceArray.add(P1.price);
        priceArray.add(P2.price);
        priceArray.add(P3.price);
        priceArray.add(P4.price);

        ArrayList<Integer> quantityArray = new ArrayList<>();
        quantityArray.add(2*P1.quantity); // 2 bags of oranges
        quantityArray.add(P2.quantity); //1 bag of strawberries
        quantityArray.add(3*P3.quantity); // 3 watermelons
        quantityArray.add(5*P4.quantity); // 5 mangoes      
        
        Order O1 = new Order(nameArray, quantityArray, priceArray);

        O1.orderTotalPrice(quantityArray, priceArray);

    }
    
}

class ProductItem {
    
    //Data fields
    String name;
    double price;
    int quantity;

    //Construct a productitem with specified parameters
    ProductItem(String newName, double newPrice, int newQuantity){
        name = newName;
        price = newPrice;
        quantity = newQuantity;

    }

    //Return the total price of the order of the product
        double itemTotalPrice(String name, double price, int quantity) {
        double total = (price * quantity);
        System.out.println("The total price of " +quantity +" " +name +" is: $" +total);
        return total;
    } 
    
}

class Order {

    ArrayList<String> nameList = new ArrayList<>();
    ArrayList<Integer> quantityList = new ArrayList<>();
    ArrayList<Double> priceList = new ArrayList<>();

    Order(ArrayList<String> n, ArrayList<Integer> q, ArrayList<Double> p){
        nameList = n;
        quantityList =q;
        priceList = p;

    }

    Double orderTotalPrice(ArrayList<Integer> qte, ArrayList<Double> pce){

        Double grandTotal = 0.00;
        for (int i = 0; i < qte.size(); i++) {
             grandTotal += (qte.get(i) * pce.get(i));
        }
        System.out.println("The grand total of the order is: $" +grandTotal);
        return grandTotal;

    }
    
}