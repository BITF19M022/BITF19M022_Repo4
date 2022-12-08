package com.usman.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonForIncrement = findViewById(R.id.btnIncrement);
        Button buttonForDecrement = findViewById(R.id.btnDecrement);
        Button buttonForClear = findViewById(R.id.btnClear);

        TextView textView = findViewById(R.id.txtViewNumber);

        final int[] counter = {0};

        buttonForIncrement.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                counter[0] = counter[0] + 1;
                textView.setText(Integer.toString(counter[0]));
            }
        });

        buttonForDecrement.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                counter[0] = counter[0] - 1;
                textView.setText(Integer.toString(counter[0]));
            }
        });

        buttonForClear.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                counter[0] = 0;
                textView.setText(Integer.toString(counter[0]));
            }
        });

    }
}