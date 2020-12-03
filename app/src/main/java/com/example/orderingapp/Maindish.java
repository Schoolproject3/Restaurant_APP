package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.orderingapp.model.CustomOrder;

public class Maindish extends AppCompatActivity {
    Button burgerButton, hotdogButton, chickenButton;
    String items = "";
    Double total = 0.00;
    CustomOrder order = CustomOrder.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maindish);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        burgerButton = findViewById(R.id.burgerButton);
        hotdogButton = findViewById(R.id.hotdogButton);
        chickenButton = findViewById(R.id.chickenButton);
    }


    public void addtoList(View view) {
    if (view == findViewById(R.id.burgerButton)){

        order.setItems(order.getItems()+"Cheese Burger"+"\n");
        order.setTotal(order.getTotal() +2.99) ;
        Toast.makeText(Maindish.this, "Cheese Burger added to cart.",Toast.LENGTH_SHORT).show();

    }

        else if (view == findViewById(R.id.hotdogButton)){

        order.setItems(order.getItems()+"Hotdog"+"\n");
        order.setTotal(order.getTotal() +1.99) ;
        Toast.makeText(Maindish.this, "Hotdog added to cart.",Toast.LENGTH_SHORT).show();

        }

        else if (view == findViewById(R.id.chickenButton)){

        order.setItems(order.getItems()+"Chicken Sandwich"+"\n");
        order.setTotal(order.getTotal() +2.50) ;
        Toast.makeText(Maindish.this, "Chicken Sandwich added to cart.",Toast.LENGTH_SHORT).show();

        }

    }
}