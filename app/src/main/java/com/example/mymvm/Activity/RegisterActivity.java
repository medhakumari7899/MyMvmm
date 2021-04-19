package com.example.mymvm.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mymvm.InterfaceApi.RegisterApi;
import com.example.mymvm.Model.RegisterCompanyModel;
import com.example.mymvm.Model.RegisterModel;
import com.example.mymvm.R;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegisterActivity extends AppCompatActivity {
    Button b1;
    TextInputEditText firstname,lastname,email,password,phoneno,address,dateofbirth,citizenship;
    String url="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        b1=findViewById(R.id.register);
        firstname=findViewById(R.id.firstnameIDTextInputEditText);
        lastname=findViewById(R.id.lastnameIDTextInputEditText);
        email=findViewById(R.id.emailaddressIDTextInputEditText);
        password=findViewById(R.id.passWordIDTextInputEditText);
        phoneno=findViewById(R.id.phonenumberIDTextInputEditText);
        address=findViewById(R.id.addressIDTextInputEditText);
        dateofbirth=findViewById(R.id.dateofbirthIDTextInputEditText);
        citizenship=findViewById(R.id.citizenshipIDTextInputEditText);


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
        RegisterApi registerApi=retrofit.create(RegisterApi.class);
        Call<RegisterModel> call=registerApi.adddata(firstname.getText().toString(),lastname.getText().toString(),email.getText().toString(),
                password.getText().toString(),phoneno.getText().toString(),address.getText().toString(), dateofbirth.getText().toString(),citizenship.getText().toString());

        call.enqueue(new Callback<RegisterModel>() {
            @Override
            public void onResponse(Call<RegisterModel> call, Response<RegisterModel> response) {
                firstname.setText("");
                lastname.setText("");
                email.setText("");
                password.setText("");
                phoneno.setText("");
                address.setText("");
                dateofbirth.setText("");
                citizenship.setText("");
            }

            @Override
            public void onFailure(Call<RegisterModel> call, Throwable t) {

            }
        });
    }
}