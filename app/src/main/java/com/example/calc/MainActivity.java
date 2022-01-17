package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnDel, btnAns, btnMulti, btnDivide, btnMinus, btnSum, btnRemainder;
    Button num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, dot;
    TextView display;
    float n1, n2;
    boolean add, multi, divide, minus, remainder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDel = findViewById(R.id.btnDelete);
        btnAns = findViewById(R.id.btnAnswer);
        btnMulti = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnMinus = findViewById(R.id.btnMinus);
        btnSum = findViewById(R.id.btnPlus);
        btnRemainder = findViewById(R.id.btnRemainder);

        num0 = findViewById(R.id.btnNum0);
        num1 = findViewById(R.id.btnNum1);
        num2 = findViewById(R.id.btnNum2);
        num3 = findViewById(R.id.btnNum3);
        num4 = findViewById(R.id.btnNum4);
        num5 = findViewById(R.id.btnNum5);
        num6 = findViewById(R.id.btnNum6);
        num7 = findViewById(R.id.btnNum7);
        num8 = findViewById(R.id.btnNum8);
        num9 = findViewById(R.id.btnNum9);
        dot = findViewById(R.id.btnDot);

        display = findViewById(R.id.display);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length() != 0){
                    //do not print the dot
                }else {
                    display.setText(display.getText() + ".");
                }
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
            }
        });
    }
}