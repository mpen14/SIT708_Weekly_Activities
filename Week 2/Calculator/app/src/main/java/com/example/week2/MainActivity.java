package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1 ,num2;
    TextView resultVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button multi = findViewById(R.id.multi);
        Button div = findViewById(R.id.div);

        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);

        resultVal = findViewById(R.id.display);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result = Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num2.getText().toString());
                resultVal.setText(result.toString());

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result = Double.parseDouble(num1.getText().toString()) - Double.parseDouble(num2.getText().toString());
                resultVal.setText(result.toString());
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result = Double.parseDouble(num1.getText().toString()) * Double.parseDouble(num2.getText().toString());
                resultVal.setText(result.toString());
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result = Double.parseDouble(num1.getText().toString()) / Double.parseDouble(num2.getText().toString());
                resultVal.setText(result.toString());
            }
        });
    }

}