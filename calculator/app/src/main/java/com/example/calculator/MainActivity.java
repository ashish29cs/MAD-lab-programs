package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2,b3,b4,clr;
    private EditText n1,n2;
    private TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.n1);
        n1.setInputType(InputType.TYPE_CLASS_NUMBER);
        n2 = (EditText) findViewById(R.id.n2);
        n2.setInputType(InputType.TYPE_CLASS_NUMBER);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        clr = findViewById(R.id.clr);
        t1 = (TextView) findViewById(R.id.t1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((n1.getText().length()>0) && (n2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(n1.getText().toString());
                    double oper2 = Double.parseDouble(n2.getText().toString());
                    double r = oper1 + oper2;
                    t1.setText(Double.toString(r));
                }
                else{
                    if(TextUtils.isEmpty(n1.getText().toString())){
                        Toast toast = Toast.makeText(MainActivity.this,"Number 1 Enter the required numbers",Toast.LENGTH_LONG);
                                toast.show();
                    }
                    if(TextUtils.isEmpty(n2.getText().toString())){
                        Toast toast = Toast.makeText(MainActivity.this,"Number 2 Enter the required numbers",Toast.LENGTH_LONG);
                                toast.show();
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((n1.getText().length()>0) && (n2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(n1.getText().toString());
                    double oper2 = Double.parseDouble(n2.getText().toString());
                    double r = oper1 - oper2;
                    t1.setText(Double.toString(r));
                }
                else{
                    if(TextUtils.isEmpty(n1.getText().toString())){
                        Toast toast = Toast.makeText(MainActivity.this,"Number 1 Enter the required numbers",Toast.LENGTH_LONG);
                                toast.show();
                    }
                    if(TextUtils.isEmpty(n2.getText().toString())){
                        Toast toast = Toast.makeText(MainActivity.this,"Number 2 Enter the required numbers",Toast.LENGTH_LONG);
                                toast.show();
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((n1.getText().length()>0) && (n2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(n1.getText().toString());
                    double oper2 = Double.parseDouble(n2.getText().toString());
                    double r = oper1 * oper2;
                    t1.setText(Double.toString(r));
                }
                else{
                    if(TextUtils.isEmpty(n1.getText().toString())){
                        Toast toast = Toast.makeText(MainActivity.this,"Number 1 Enter the required numbers",Toast.LENGTH_LONG);
                                toast.show();
                    }
                    if(TextUtils.isEmpty(n2.getText().toString())){
                        Toast toast = Toast.makeText(MainActivity.this,"Number 2 Enter the required numbers",Toast.LENGTH_LONG);
                                toast.show();
                    }
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((n1.getText().length()>0) && (n2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(n1.getText().toString());
                    double oper2 = Double.parseDouble(n2.getText().toString());
                    double r = oper1 / oper2;
                    t1.setText(Double.toString(r));
                }
                else{
                    if(TextUtils.isEmpty(n1.getText().toString())){
                        Toast toast = Toast.makeText(MainActivity.this,"Number 1 Enter the required numbers",Toast.LENGTH_LONG);
                                toast.show();
                    }
                    if(TextUtils.isEmpty(n2.getText().toString())){
                        Toast toast = Toast.makeText(MainActivity.this,"Number 2 Enter the required numbers",Toast.LENGTH_LONG);
                                toast.show();
                    }
                }
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1.setText(" ");
                n2.setText(" ");
                t1.setText("0.00");
                n1.requestFocus();
            }
        });
    }
}