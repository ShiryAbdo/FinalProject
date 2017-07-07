package com.example.shaymaa.finalproject.interfaces;

import com.example.shaymaa.finalproject.data.JSONResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Shaymaa on 6/23/2017.
 */

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}
