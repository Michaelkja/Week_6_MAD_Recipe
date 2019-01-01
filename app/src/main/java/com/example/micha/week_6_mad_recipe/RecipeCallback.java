package com.example.micha.week_6_mad_recipe;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RecipeCallback {

    @SerializedName("count")
    @Expose
    int count;
    @SerializedName("recipes")
    @Expose
    ArrayList<Recipe> recipes;
}
