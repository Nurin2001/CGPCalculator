package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void CGPA(View v) {
        Intent i = new Intent(this, no_of_sem.class);
        startActivity(i);
    }
    public void GPA(View v) {
        Intent i = new Intent(this, no_of_sub.class);
        startActivity(i);
    }
}