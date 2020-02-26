package com.example.login_test6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Phone_num extends AppCompatActivity {

    Button btnFinish;
    EditText etPh1,etPh2,etPh3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_num);
        btnFinish = findViewById(R.id.finish);
        etPh1=findViewById(R.id.phn1);
        etPh2=findViewById(R.id.phn2);
        etPh3=findViewById(R.id.phn3);

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ph1 = etPh1.getText().toString().trim();
                String ph2 = etPh2.getText().toString().trim();
                String ph3 = etPh3.getText().toString().trim();
                if(TextUtils.isEmpty(ph1)){
                    etPh1.setError("Phone number is Required.");
                    return;
                }
                if(TextUtils.isEmpty(ph2)){
                    etPh2.setError("Phone number is Required.");
                    return;
                }
                if(TextUtils.isEmpty(ph3)){
                    etPh3.setError("Phone number is Required.");
                    return;
                }

                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}
