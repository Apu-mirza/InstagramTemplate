package com.example.instagramc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView, recyclerView2;
    private String[] countryNames;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.storyRecycleId);
        recyclerView2 = findViewById(R.id.timeRecycleId);
        countryNames = getResources().getStringArray(R.array.country_names);

        MyAdapter myAdapter = new MyAdapter(this, countryNames);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myAdapter);

        TimeAdapter timeAdapter = new TimeAdapter(this, countryNames);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView2.setAdapter(timeAdapter);
    }

}