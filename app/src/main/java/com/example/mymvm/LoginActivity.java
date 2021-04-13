package com.example.mymvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText et1,et2;
    CardView cv;
    TextView tvlogin,tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        et1=findViewById(R.id.nameIDTextInputEditText);
        et2=findViewById(R.id.passwordIDTextInputEditText);
        cv=findViewById(R.id.cv);
        tv1=findViewById(R.id.tvforgotpassword);
//        tv2=findViewById(R.id.tvregister);
//        tv2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}