package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        try {
            Bundle arguments = getIntent().getExtras();
            assert arguments != null;
            String result = Objects.requireNonNull(arguments.get("result")).toString();
            TextView textView = findViewById(R.id.result);
            textView.setText(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}