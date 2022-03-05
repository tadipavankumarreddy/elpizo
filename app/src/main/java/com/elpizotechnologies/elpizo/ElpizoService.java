package com.elpizotechnologies.elpizo;

import android.annotation.SuppressLint;

import androidx.annotation.RawRes;

import com.elpizotechnologies.elpizo.loginauth.Example;
import com.google.gson.annotations.JsonAdapter;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ElpizoService {

    @Headers("Content-Type: application/json")
    @POST("/auth/login/")
    Call<Example> login(@Body LoginAuthModel loginAuthModel);

}
