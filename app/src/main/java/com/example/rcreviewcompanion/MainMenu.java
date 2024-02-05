package com.example.rcreviewcompanion;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AchievementAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenulight);

        recyclerView = findViewById(R.id.menuRecycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Achievement> achievements = createAchievementsList();
        adapter = new AchievementAdapter(achievements);
        recyclerView.setAdapter(adapter);
    }

    private List<Achievement> createAchievementsList() {
        List<Achievement> achievements = new ArrayList<>();
        String[] names = getResources().getStringArray(R.array.ach_names);
        String[] meanings = getResources().getStringArray(R.array.names_meaning);
        int[] imageResources = {R.drawable.farimg, R.drawable.afarimg, R.drawable.taximg, R.drawable.msimg, R.drawable.lawimg, R.drawable.auditingimg};

        for (int i = 0; i < names.length; i++) {
            achievements.add(new Achievement(names[i], meanings[i], imageResources[i]));
        }

        return achievements;
    }
}

