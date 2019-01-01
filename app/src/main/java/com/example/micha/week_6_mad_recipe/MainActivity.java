package com.example.micha.week_6_mad_recipe;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private ArrayList<Recipe> recipes = new ArrayList<>();
    private RecipeAdapter recipeAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestData();

        recipeAdapter = new RecipeAdapter(getSupportFragmentManager(),recipes);

        viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(recipeAdapter);

    }
    private void requestData() {
        RecipeApi service = RecipeApi.retrofit.create(RecipeApi.class);
        Call<RecipeCallback> call = service.getRecipe();

        call.enqueue(new Callback<RecipeCallback>() {
            @Override
            public void onResponse(Call<RecipeCallback> call, Response<RecipeCallback> response) {

                if (response.body() != null) {

                    recipes.addAll(Arrays.asList(response.body().recipes));
                    recipeAdapter.notifyDataSetChanged();

                }

            }

            @Override
            public void onFailure(Call<RecipeCallback> call, Throwable t) {
                Log.d("error",t.toString());
            }
        });


    }
}

