package com.example.micha.week_6_mad_recipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class RecipeAdapter  extends FragmentPagerAdapter  {

    private ArrayList<Recipe> recipes = new ArrayList<>();

    public RecipeAdapter(FragmentManager fm, ArrayList<Recipe> recipes) {
        super(fm);
        this.recipes = recipes;
    }


    @Override
    public Fragment getItem(int position) {

        return RecipeFragment.newInstance(recipes.get(position));
    }

    @Override
    public int getCount() {

        return recipes.size();
    }
}
