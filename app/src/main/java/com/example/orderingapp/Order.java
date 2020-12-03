package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orderingapp.model.CustomOrder;

public class Order extends AppCompatActivity {
    CustomOrder order = CustomOrder.getInstance();
    TextView orderList, pricebTax, priceaTax;
    double afterTax = order.getTotal() + (order.getTotal()*0.065);
    String list = order.getItems();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        orderList = findViewById(R.id.orderList);
        pricebTax = findViewById(R.id.pricebTax);
        priceaTax = findViewById(R.id.priceaTax);
        
        
        orderList.setText(list);
        pricebTax.setText("Total before tax $ "+ order.getTotal());
        priceaTax.setText("Total after 6.5% tax $ "+String.format("%.2f", afterTax));

    }

    public void placeOrder(View view) {
        order.setTotal(0.00);
        order.setItems("");
        Toast.makeText(Order.this, "Order Placed.",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Order.this, Menu.class));

    }
}