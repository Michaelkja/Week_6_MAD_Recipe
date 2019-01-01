package com.example.micha.week_6_mad_recipe;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface RecipeApi {

    String BASE_URL = "https://www.food2fork.com/";


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    @GET("api/search?key=e9e37f79963e79b7c7b665da14fdd636&sort=r&count=3")
    Call<RecipeCallback> getRecipe();
}
