package com.example.stan.additiontest;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numberOne = (EditText) findViewById(R.id.first_number);
                EditText numberTwo = (EditText) findViewById(R.id.second_number);
                TextView result = (TextView) findViewById(R.id.result);
                int numOne = Integer.parseInt(numberOne.getText().toString());
                int numTwo = Integer.parseInt(numberTwo.getText().toString());
                int sum = numOne + numTwo;
                result.setText(Integer.toString(sum));
            }
        });

    }


}
