package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText number1;
    EditText number2;
    ImageButton button_sum;
    ImageButton button_minus;
    ImageButton button_div;
    ImageButton button_mult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.num1);
        number2 = findViewById(R.id.num2);
        button_sum = findViewById(R.id.button_sum);
        button_minus = findViewById(R.id.button_minus);
        button_div = findViewById(R.id.button_div);
        button_mult = findViewById(R.id.button_mult);

        button_sum.setOnClickListener(this);
        button_minus.setOnClickListener(this);
        button_div.setOnClickListener(this);
        button_mult.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;

        if (TextUtils.isEmpty(number1.getText().toString()) || TextUtils.isEmpty(number2.getText().toString()))
            return;
        num1 = Float.parseFloat(number1.getText().toString());
        num2 = Float.parseFloat(number2.getText().toString());

        switch (view.getId()) {
            case R.id.button_sum:

                result = num1 + num2;
                break;

            case R.id.button_minus:

                result = num1 - num2;
                break;

            case R.id.button_mult:

                result = num1 * num2;
                break;
            case R.id.button_div:

                result = num1 / num2;
                break;
        }
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", Float.toString(result));
        startActivity(intent);
    }
}