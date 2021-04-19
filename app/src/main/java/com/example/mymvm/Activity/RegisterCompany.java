package com.example.mymvm.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mymvm.InterfaceApi.CompanyRegisterApi;
import com.example.mymvm.Model.RegisterCompanyModel;
import com.example.mymvm.R;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegisterCompany extends AppCompatActivity {
    Button b1;
    TextInputEditText name,country,streetaddress, mainbussinessactivities,shareholders,percentages;
    String url="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_company);
        b1=findViewById(R.id.registerCompany);
        name=findViewById(R.id.nameIDTextInputEditText);
        country=findViewById(R.id.countryIDTextInputEditText);
        streetaddress=findViewById(R.id.streetaddressIDTextInputEditText);
        mainbussinessactivities=findViewById(R.id.mainbusinessactivityIDTextInputEditText);
        shareholders=findViewById(R.id.shareholdersIDTextInputEditText);
        percentages=findViewById(R.id.percentagesIDTextInputEditText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process();
            }
        });
    }

    public void process()
    {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CompanyRegisterApi api=retrofit.create(CompanyRegisterApi.class);
        Call<RegisterCompanyModel> call=api.adddata(name.getText().toString(),country.getText().toString(),streetaddress.getText().toString(),mainbussinessactivities.getText().toString(),shareholders.getText().toString(),percentages.getText().toString());
        call.enqueue(new Callback<RegisterCompanyModel>() {
            @Override
            public void onResponse(Call<RegisterCompanyModel> call, Response<RegisterCompanyModel> response) {
                name.setText("");
                country.setText("");
                streetaddress.setText("");
                mainbussinessactivities.setText("");
                shareholders.setText("");
                percentages.setText("");

                Toast.makeText(getApplicationContext(),response.toString(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<RegisterCompanyModel> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.toString(),Toast.LENGTH_LONG).show();

            }
        });

    }

    }
