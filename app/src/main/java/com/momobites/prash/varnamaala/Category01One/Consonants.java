package com.momobites.prash.varnamaala.Category01One;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.momobites.prash.varnamaala.Data.Data01Letters;
import com.momobites.prash.varnamaala.ModelAdapters.LetterAdapter;
import com.momobites.prash.varnamaala.R;




public class Consonants extends Fragment {

    public Consonants(){
        // Required Empty public Constructor
    }

    RecyclerView recyclerView;
    Context context;
    LetterAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate layout for this Fragment
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        // Fix the RecycleView to the inflated Fragment
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycleView);
        // Setting Up Data - fill data
        adapter = new LetterAdapter(getContext(), Data01Letters.getConsonants());
        // Set Adapter
        recyclerView.setAdapter(adapter);
        // Set Layout Manager
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity())); // Vertical Orientation By Default
        // Return
        return rootView;

    }

    @Override
    public void onStop() {
        super.onStop();

    }

}