package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int strNum1;
    int strNum2;
    EditText number1;
    EditText number2;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
//        if (savedInstanceState != null) {
//            number1.setText(Integer.parseInt(String.valueOf(strNum1)));
//            number2.setText(Integer.parseInt(String.valueOf(strNum2)));
//            number1.setText("4");
//        }
    }

//    @Override
//    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
//        super.onSaveInstanceState(savedInstanceState);
//        strNum1 = Integer.parseInt(number1.getText().toString());
//        strNum2 = Integer.parseInt(number2.getText().toString());
//        savedInstanceState.putInt("num1", strNum1);
//        savedInstanceState.putInt("num2", strNum2);
//    }

    public void addButtonClick(View view) {
        if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Empty fields!", Toast.LENGTH_SHORT).show();
        } else {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            int res = num1 + num2;
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result", res);
            startActivity(intent);
        }
    }

    public void subtractButtonClick(View view) {
        if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Empty fields!", Toast.LENGTH_SHORT).show();
        } else {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            int res = num1 - num2;
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result", res);
            startActivity(intent);
        }
    }

    public void multiplyButtonClick(View view) {
        if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Empty fields!", Toast.LENGTH_SHORT).show();
        } else {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            int res = num1 * num2;
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result", res);
            startActivity(intent);
        }
    }

    public void divideButtonClick(View view) {
        if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Empty fields!", Toast.LENGTH_SHORT).show();
        } else {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            if (num2 == 0) {
                Toast.makeText(MainActivity.this, "You can't divide by Zero!", Toast.LENGTH_SHORT).show();
            } else {
                int res = num1 / num2;
                Intent intent = new Intent(this, ResultActivity.class);
                intent.putExtra("result", res);
                startActivity(intent);
            }
        }
    }

    private void init() {
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        plus = (Button) findViewById(R.id.plusButton);
        minus = (Button) findViewById(R.id.minusButton);
        multiply = (Button) findViewById(R.id.multiplyButton);
        divide = (Button) findViewById(R.id.divideButton);
    }
}