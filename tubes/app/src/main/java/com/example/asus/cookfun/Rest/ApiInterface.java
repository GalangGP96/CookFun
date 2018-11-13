package com.example.asus.cookfun.Rest;

import com.example.asus.cookfun.Model.PostPutDelUser;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    //    Login
    @FormUrlEncoded
    @POST("Login")
    Call<PostPutDelUser> getLogin(@Field("email") String email,
                                  @Field("password") String password);
}
