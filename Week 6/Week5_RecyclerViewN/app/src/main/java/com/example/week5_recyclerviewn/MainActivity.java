package com.example.week5_recyclerviewn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    recyclerAdapter adapter;

    String monthNames[]={"January  31","February  28","March  31","April  30","May  31","June  30","July  31","August  31","September  30","October  31","November  30","December  31"};

  //  List<String> monthNames = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new recyclerAdapter(this, monthNames);
        recyclerView.setAdapter(adapter);

    }
}