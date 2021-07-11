package com.example.sms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtMno, txtMsg;
    Button btnSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMno = findViewById(R.id.sms_num);
        txtMsg = findViewById(R.id.sms_text);
        btnSms = findViewById(R.id.btn_send);
        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    SmsManager smgr = SmsManager.getDefault();
                    smgr.sendTextMessage(txtMno.getText().toString() ,null, txtMsg.getText().toString(),null,null);
                    Toast.makeText(MainActivity.this, "SMS Sent Successfully", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "SMS failed to send," + "Please try again", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}