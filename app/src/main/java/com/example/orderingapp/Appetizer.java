package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.orderingapp.model.CustomOrder;

public class Appetizer extends AppCompatActivity {

    Button friesButton, onionButton, saladButton;
    String items = "";
    Double total = 0.00;
    CustomOrder order = CustomOrder.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appetizer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        friesButton = findViewById(R.id.friesButton);
        onionButton = findViewById(R.id.onionButton);
        saladButton = findViewById(R.id.saladButton);
    }


    public void addtoList(View view) {
        if (view == findViewById(R.id.friesButton)){

            order.setItems(order.getItems()+"Fries"+"\n");
            order.setTotal(order.getTotal() +1.99) ;
            Toast.makeText(Appetizer.this, "Fries added to cart.",Toast.LENGTH_SHORT).show();

        }

        else if (view == findViewById(R.id.onionButton)){

            order.setItems(order.getItems()+"Onion Rings"+"\n");
            order.setTotal(order.getTotal() +1.99) ;
            Toast.makeText(Appetizer.this, "Onion Rings added to cart.",Toast.LENGTH_SHORT).show();

        }

        else if (view == findViewById(R.id.saladButton)){

            order.setItems(order.getItems()+"Salad"+"\n");
            order.setTotal(order.getTotal() +4.99) ;
            Toast.makeText(Appetizer.this, "Salad added to cart.",Toast.LENGTH_SHORT).show();

        }

    }
}