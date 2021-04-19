package com.example.mymvm.InterfaceApi;

import com.example.mymvm.Model.RegisterCompanyModel;
import com.example.mymvm.Model.RegisterModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RegisterApi {


    @FormUrlEncoded
    @POST("")
    Call<RegisterModel> adddata(@Field("firstname") String firstname, @Field("lastname") String lastname, @Field("email") String email, @Field("password") String password, @Field("phoneno") String phoneno, @Field("address") String address, @Field("dateofbirth") String dateofbirth, @Field("citizenship") String citizenship);
}
