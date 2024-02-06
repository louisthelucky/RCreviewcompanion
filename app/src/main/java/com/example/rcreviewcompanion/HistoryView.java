package com.example.rcreviewcompanion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HistoryView extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HistoryAdapter historyAdapter;
    private List<String> sampleData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_view);

        recyclerView = findViewById(R.id.historyrecycleview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Create sample data
        sampleData = new ArrayList<>();
        sampleData.add("Sample Item 1");
        sampleData.add("Sample Item 2");
        sampleData.add("louis");
        sampleData.add("Greg");
        sampleData.add("Jeff");
        sampleData.add("Aleah");
        sampleData.add("Far");
        sampleData.add("Shesh");


        // Initialize adapter with sample data
        historyAdapter = new HistoryAdapter(sampleData);
        recyclerView.setAdapter(historyAdapter);

    }
}