package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class no_of_sem extends AppCompatActivity {

    EditText noTxt = findViewById(R.id.noTxt);
    CGPACalc calc = new CGPACalc();
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_of_sem);
        next = findViewById(R.id.nextBtn);

      /*  next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Sem();
              //  nextScreen();
            }
        });*/
    }
    private void Sem() {
        int sem = Integer.parseInt(String.valueOf(noTxt.getText()));
        calc.calc(sem);
    }
    public void nextScreen() {
        Intent i = new Intent(this, CGPACalc.class);
        startActivity(i);
    }
}