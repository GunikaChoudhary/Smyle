package com.example.jahanveenarang.smyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class JoinUS extends AppCompatActivity {

    android.support.v7.widget.Toolbar  toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_us);
        
        toolbar= findViewById(R.id.toolbar_joinUs);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Join Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        
        
    }
}
