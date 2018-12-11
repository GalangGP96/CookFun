package com.example.asus.cookfun.Rest;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

import com.example.asus.cookfun.Model.*;

public interface ApiInterface {
    //  Login
    @FormUrlEncoded
    @POST("Login")
    Call<PostPutDelUser> getLogin(@Field("email") String email,
                                  @Field("password") String password);

    //  User
    @FormUrlEncoded
    @POST("User")
    Call<PostPutDelUser> postUser(@Field("username") String username,
                                      @Field("email") String email,
                                      @Field("password") String password,
                                      @Field("country") String country,
                                      @Field("description") String description);

    //  Resep
    @GET("ResepMain")
    Call<GetResep> getResep();
}
