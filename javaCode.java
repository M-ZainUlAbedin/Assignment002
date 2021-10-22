package com.example.calculator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button sub;
    private Button multi;
    private Button divide;
    private Button clear;
    private Button equal;
    private TextView info;
    private TextView result;
    private final char Addition = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private double val1 = Double.NaN;
    private double val2;
    private void setUIViews(){
        one = (Button)findViewById(R.id.btn1);
        zero = (Button)findViewById(R.id.btn0);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five= (Button)findViewById(R.id.btn5);
        six= (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight= (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        add = (Button)findViewById(R.id.btnpls);
        sub = (Button)findViewById(R.id.btnmns);
        multi = (Button)findViewById(R.id.btnmlti);
        divide = (Button)findViewById(R.id.btndvd);
        info = (TextView)findViewById(R.id.textViewControl);
        result = (TextView) findViewById(R.id.textViewDisplay);
}

}