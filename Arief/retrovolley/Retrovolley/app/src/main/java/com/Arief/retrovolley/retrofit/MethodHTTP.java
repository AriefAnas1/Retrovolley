package com.Arief.retrovolley.retrofit;

import com.Arief.retrovolley.Request;
import com.Arief.retrovolley.User;
import com.Arief.retrovolley.UserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MethodHTTP {

    @GET("User_Registration.php")
    Call<UserResponse> getUser();

    @POST("User_Registration.php")
    Call<Request> sendUser(@Body User user);
}
