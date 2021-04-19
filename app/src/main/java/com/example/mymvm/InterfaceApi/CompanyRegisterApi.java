package com.example.mymvm.InterfaceApi;

import com.example.mymvm.Model.RegisterCompanyModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface CompanyRegisterApi {
    @FormUrlEncoded
    @POST("")
    Call<RegisterCompanyModel> adddata(@Field("name") String name, @Field("country") String country, @Field("streetaddress")String streetaddress , @Field("mainbussinessactivities")String mainbussinessactivities, @Field("sshareholders")String shareholders, @Field("percentages")String percentages);
}
