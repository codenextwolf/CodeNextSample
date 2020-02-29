package com.example.android.codenextsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CoachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach);


        ArrayList<SectionItem> coachList = new ArrayList<>();
        coachList.add(new SectionItem(R.drawable.placeholder, "Coach Wolf"));
        coachList.add(new SectionItem(R.drawable.placeholder, "Coach Alyssa"));
        coachList.add(new SectionItem(R.drawable.placeholder, "Coach Shaquan"));
        coachList.add(new SectionItem(R.drawable.placeholder, "Coach Donna"));
        coachList.add(new SectionItem(R.drawable.placeholder, "Coach Jason"));
        coachList.add(new SectionItem(R.drawable.placeholder, "Coach Blanca"));
        coachList.add(new SectionItem(R.drawable.placeholder, "Coach Natalie"));
        coachList.add(new SectionItem(R.drawable.placeholder, "Coach Peta"));

        ListView coachListView = findViewById(R.id.coach_listview);
        SectionAdapter coachAdapter = new SectionAdapter(this, R.layout.section_item, coachList);
        coachListView.setAdapter(coachAdapter);
    }
}
