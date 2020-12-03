package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.orderingapp.model.CustomOrder;

public class Dessert extends AppCompatActivity {

    Button pieButton, icecreamButton, cakeButton;
    String items = "";
    Double total = 0.00;
    CustomOrder order = CustomOrder.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        pieButton = findViewById(R.id.pieButton);
        icecreamButton = findViewById(R.id.icecreamButton);
        cakeButton = findViewById(R.id.cakeButton);
    }


    public void addtoList(View view) {
        if (view == findViewById(R.id.pieButton)){

            order.setItems(order.getItems()+"Pie"+"\n");
            order.setTotal(order.getTotal() +3.99) ;
            Toast.makeText(Dessert.this, "Pie added to cart.",Toast.LENGTH_SHORT).show();

        }

        else if (view == findViewById(R.id.icecreamButton)){

            order.setItems(order.getItems()+"Icecream"+"\n");
            order.setTotal(order.getTotal() +.99) ;
            Toast.makeText(Dessert.this, "Icecream added to cart.",Toast.LENGTH_SHORT).show();

        }

        else if (view == findViewById(R.id.cakeButton)){

            order.setItems(order.getItems()+"Chocolate Cake"+"\n");
            order.setTotal(order.getTotal() +2.99) ;
            Toast.makeText(Dessert.this, "Chocolate cake added to cart.",Toast.LENGTH_SHORT).show();

        }

    }
}