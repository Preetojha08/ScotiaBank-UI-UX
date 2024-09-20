package com.example.scotiabankjavaapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {


    RecyclerView recyclerViewAcc;
    RecyclerView recyclerViewApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        recyclerViewAcc = (RecyclerView) findViewById(R.id.accountrecyclerview);
        recyclerViewApp = (RecyclerView) findViewById(R.id.apprecyclerview);

        List<String> accInfoItems = new ArrayList<>();
        List<String> appInfoItems = new ArrayList<>();

        List<Integer> accInfoImages = new ArrayList<>();
        List<Integer> appInfoImages = new ArrayList<>();

        accInfoItems.add("Account Display");
        accInfoItems.add("Manage Autodeposit");
        accInfoItems.add("Manage Interac Registration");
        accInfoItems.add("Manage Credit Score");
        accInfoItems.add("Edit Transaction Limit");

        accInfoImages.add(R.drawable.displayacc);
        accInfoImages.add(R.drawable.autodeposit);
        accInfoImages.add(R.drawable.accinteract);
        accInfoImages.add(R.drawable.creditcard);
        accInfoImages.add(R.drawable.acclimitedmoney);

        appInfoItems.add("Application Theme");
        appInfoItems.add("Application Language");
        appInfoItems.add("Manage Widgets");

        appInfoImages.add(R.drawable.theme);
        appInfoImages.add(R.drawable.banklanguage);
        appInfoImages.add(R.drawable.appwidgets);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this,accInfoItems,accInfoImages);
        recyclerViewAcc.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerViewAcc.setAdapter(recyclerViewAdapter);

        RecyclerViewAdapter recyclerViewAdapter2 = new RecyclerViewAdapter(this,appInfoItems,appInfoImages);
        recyclerViewApp.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerViewApp.setAdapter(recyclerViewAdapter2);

    }
}