package com.example.orderingapp.model;

import android.app.Application;
public class CustomOrder extends Application {
    private String items = "";
    private double total = 0.00;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }



    private static CustomOrder instance;

    public static CustomOrder getInstance() {
        if (instance == null)
            instance = new CustomOrder();
        return instance;
    }

    private CustomOrder() { }
}
