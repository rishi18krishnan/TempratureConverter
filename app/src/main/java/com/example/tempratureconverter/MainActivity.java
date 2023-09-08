package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AppCompatButton ftc, ctf;
    double result0;
    TextView result;
    EditText entNumber;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ftc = findViewById(R.id.ftc);
        ctf = findViewById(R.id.ctf);
        entNumber = findViewById(R.id.number);
        result = findViewById(R.id.result);

        ftc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(entNumber.getText().toString());
                result0 = (temp -32) / 1.8;
                result.setText(String.valueOf(result0));
            }
        });

        ctf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double temp = Double.parseDouble(entNumber.getText().toString());
                result0 = (temp *1.8) + 32;
                result.setText(String.valueOf(result0));

            }
        });

    }
}