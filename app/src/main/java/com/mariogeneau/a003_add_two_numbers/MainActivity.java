package com.mariogeneau.a003_add_two_numbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //---------------------
    EditText firstNumber;
    EditText secondNumber;
    TextView addResult;
    double num1, num2, sum;
    //---------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //------
        firstNumber = findViewById(R.id.field1);
        secondNumber = findViewById(R.id.field2);
        addResult = findViewById(R.id.result);
    }
    //---------------------
    public void addTwoNumbers(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        num2 = Double.parseDouble(secondNumber.getText().toString());
        sum = num1 + num2;
        addResult.setText(Double.toString(sum));
    }
    //---------------------
}
