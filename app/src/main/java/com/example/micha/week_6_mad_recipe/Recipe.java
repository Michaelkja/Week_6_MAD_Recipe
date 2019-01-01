package com.example.micha.week_6_mad_recipe;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Recipe {

    @SerializedName("recipe_id")
    @Expose
    private String recipeId;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("title")
    @Expose
    private String title;

    public Recipe (int id , String title , String imageUrl) {
        this.recipeId =  recipeId;
        this.imageUrl = imageUrl;
        this.title = title;
    }

    public String getId() {
        return recipeId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.recipeId = recipeId;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
