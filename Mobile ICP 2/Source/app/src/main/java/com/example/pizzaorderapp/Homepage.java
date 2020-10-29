package com.example.pizzaorderapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

    }
    public void orderPizza(View view) {
        Intent intent = new Intent(Homepage.this, Orderpage.class);
        startActivity(intent);
    }
}