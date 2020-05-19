package com.codegama.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.codegama.commutionlibrary.CallAnotherAppActivity;

public class MainActivity extends AppCompatActivity {

    Button addition;
    Button subtraction;
    int sum, firstNumb, secondNumb;
    TextView total, inputOne, inputTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getExtras() != null) {
            sum = getIntent().getExtras().getInt("SUM");
            firstNumb = getIntent().getExtras().getInt("INPUT_ONE");
            secondNumb = getIntent().getExtras().getInt("INPUT_TWO");
        }

        addition = findViewById(R.id.addition);
        subtraction = findViewById(R.id.subtraction);
        total = findViewById(R.id.total);
        inputOne = findViewById(R.id.inputoneText);
        inputTwo = findViewById(R.id.inputTwoText);

        inputOne.setText(String.valueOf(firstNumb));
        inputTwo.setText(String.valueOf(secondNumb));
        total.setText(String.valueOf(sum));

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallAnotherAppActivity.callApplication(Integer.parseInt(inputOne.getText().toString()), Integer.parseInt(inputTwo.getText().toString()), 1);
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callAnotherApplication(Integer.parseInt(inputOne.getText().toString()), Integer.parseInt(inputTwo.getText().toString()), 2);
            }
        });
    }
}
