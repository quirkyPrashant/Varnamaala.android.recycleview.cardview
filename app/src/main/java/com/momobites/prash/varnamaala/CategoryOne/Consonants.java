package com.momobites.prash.varnamaala.CategoryOne;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.momobites.prash.varnamaala.Data.DataLetters;
import com.momobites.prash.varnamaala.ModelAdapters.ConsonantAdapter;
import com.momobites.prash.varnamaala.R;

/**
 * Created by prash on 6/24/2017.
 */

public class Consonants extends AppCompatActivity {

    RecyclerView recyclerView;

    ConsonantAdapter adapter;
    View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        adapter = new ConsonantAdapter(this, DataLetters.getConsonants());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Vertical Orientation By Default






    }
}