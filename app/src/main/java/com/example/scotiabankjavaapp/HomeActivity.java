package com.example.scotiabankjavaapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    ImageView logoutBtn,profileBtn;
    boolean logoutFlag = true;
    Handler handler = new Handler();

    LinearLayout move_money_ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        move_money_ll=(LinearLayout) findViewById(R.id.home_move_money_layout);

        move_money_ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this,SendMoneyActivity.class));
            }
        });

        if (logoutFlag)
        {
            Log.d("Logout", "Yeh kses run hoga agar ye wala hoga toh problem hogi"+logoutFlag);
            handler.postDelayed(runnable, 50000000);
        }
//        50000
        logoutBtn = (ImageView) findViewById(R.id.homeLogoutBtn);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoutFlag = false;
                logoutFunction();
            }
        });

        profileBtn = (ImageView) findViewById(R.id.homeProfileBtn);
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
            }
        });

    }
    public void logoutFunction() {
        Toast.makeText(HomeActivity.this, "Logout Successful", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(HomeActivity.this, MainActivity.class));
        Log.d("Logout", "Logout Successful jjjjj    "+logoutFlag);
        finish();
    }
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            //to logout the user
            logoutFunction();
        }
    };


}