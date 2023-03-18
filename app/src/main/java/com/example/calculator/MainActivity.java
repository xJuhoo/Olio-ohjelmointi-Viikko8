package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstInput;
    private EditText secondInput;
    private TextView textResult;

    private double firstNumber;
    private double secondNumber;
    private double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lets access our user inputs
        firstInput = findViewById(R.id.editFirstValue);
        secondInput = findViewById(R.id.editSecondValue);
        textResult = findViewById(R.id.textResult);

    }

    public void doAddition(View view) {
        // Turn user inputs into Integers
        try {
            firstNumber = Double.parseDouble(firstInput.getText().toString());
            secondNumber = Double.parseDouble(secondInput.getText().toString());
            result = firstNumber + secondNumber;

            // If user has not used decimals, we don't display them
            if (result % 1 == 0) {

                textResult.setText(Integer.toString((int) result));
            }
            else {
                textResult.setText(Double.toString(result));
            }
        } catch (NumberFormatException e) {
            // In case of Invalid Input we display nothing
            textResult.setText("");
        }
    }

    public void doSubtraction(View view) {
        try {
            firstNumber = Double.parseDouble(firstInput.getText().toString());
            secondNumber = Double.parseDouble(secondInput.getText().toString());
            result = firstNumber - secondNumber;

            if (result % 1 == 0) {

                textResult.setText(Integer.toString((int) result));
            }
            else {
                textResult.setText(Double.toString(result));
            }
        } catch (NumberFormatException e) {
            textResult.setText("");
        }
    }

    public void doMultiplication(View view) {
        try {
            firstNumber = Double.parseDouble(firstInput.getText().toString());
            secondNumber = Double.parseDouble(secondInput.getText().toString());
            result = firstNumber * secondNumber;

            if (result % 1 == 0) {
                textResult.setText(Integer.toString((int) result));
            }
            else {
                textResult.setText(Double.toString(result));
            }
        } catch (NumberFormatException e) {
            textResult.setText("");
        }
    }

    public void doDivision(View view) {
        try {
            firstNumber = Double.parseDouble(firstInput.getText().toString());
            secondNumber = Double.parseDouble(secondInput.getText().toString());
            if (secondNumber == 0) {
                result = 0;
            }
            else {
                result = firstNumber / secondNumber;
            }

            if (result % 1 == 0) {

                textResult.setText(Integer.toString((int) result));
            }
            else {
                textResult.setText(String.format("%.2f", result));
            }
        } catch (NumberFormatException e) {
            textResult.setText("");
        }
    }
}