package com.example.mymvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hbb20.CountryCodePicker;

public class SearchCountry extends AppCompatActivity {
     private CountryCodePicker ccp;
     TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_country);
        textView=findViewById(R.id.textQr);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SearchCountry.this,ScanBarCodeActivity.class);
                startActivity(intent);
            }
        });



    }
}