package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.orderingapp.model.CustomOrder;

public class Drink extends AppCompatActivity {


    Button softdrinkButton, milkshakeButton;
    String items = "";
    Double total = 0.00;
    CustomOrder order = CustomOrder.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        softdrinkButton = findViewById(R.id.softdrinkButton);
        milkshakeButton = findViewById(R.id.milkshakeButton);
    }


    public void addtoList(View view) {
        if (view == findViewById(R.id.softdrinkButton)){

            order.setItems(order.getItems()+"Softdrink"+"\n");
            order.setTotal(order.getTotal() +1.99) ;
            Toast.makeText(Drink.this, "Softdrink added to cart.",Toast.LENGTH_SHORT).show();

        }

        else if (view == findViewById(R.id.milkshakeButton)){

            order.setItems(order.getItems()+"Milkshake"+"\n");
            order.setTotal(order.getTotal() +2.99) ;
            Toast.makeText(Drink.this, "Milkshake added to cart.",Toast.LENGTH_SHORT).show();

        }

    }
}