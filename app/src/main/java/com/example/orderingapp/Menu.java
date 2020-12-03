package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.orderingapp.model.CustomOrder;

public class Menu extends AppCompatActivity {
    CustomOrder order = CustomOrder.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void mainDish(View view) {
        startActivity(new Intent(Menu.this, Maindish.class));
    }

    public void appetizer(View view) {
        startActivity(new Intent(Menu.this, Appetizer.class));
    }

    public void desserts(View view) {
        startActivity(new Intent(Menu.this, Dessert.class));
    }

    public void drink(View view) {
        startActivity(new Intent(Menu.this, Drink.class));
    }

    public void cart(View view) {
        startActivity(new Intent(Menu.this, Order.class));

    }
}