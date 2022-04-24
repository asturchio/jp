package com.example.jp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SidesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sides);

        ListView sidesList = findViewById(R.id.list_view_sides);

        Dish[] sides = {
                new Dish("Tahini and onion bagel", "A warm bagel filled with tahini and dried onion", 299),
                new Dish("Feta and celeriac dumplings", "Thin pastry cases stuffed with tangy feta and fresh celeriac", 399),
                new Dish("Cheese and rosemary biscuits", "Crunchy biscuits made with vintage cheese and fresh rosemary", 599),
                new Dish("Black pepper and fish panini", "A hot, pressed panini filled with crushed black pepper and fish", 599),
                new Dish("Mac and Cheese", "Macaroni covered in cheddar cheese", 499)

        };
        ArrayAdapter<Dish> dishAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,sides);
        sidesList.setAdapter(dishAdapter);
    }
}