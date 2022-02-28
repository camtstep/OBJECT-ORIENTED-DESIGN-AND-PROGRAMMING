package com.company;

public class Pizza {
    public String ingredients, address;
    public Pizza next;

    public Pizza(String ingredients, String address) {
        this.address = address;
        this.ingredients = ingredients;
        next = null;
    }
}
