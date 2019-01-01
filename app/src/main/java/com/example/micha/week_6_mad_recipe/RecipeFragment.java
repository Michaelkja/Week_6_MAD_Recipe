package com.example.micha.week_6_mad_recipe;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class RecipeFragment extends Fragment {

    private static final String ARG_ID = "id";
    private Recipe recipe;

    public static RecipeFragment newInstance(Recipe recipe) {
        RecipeFragment fragment = new RecipeFragment();
        Bundle args = new Bundle();

        args.putParcelable(ARG_ID, recipe);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recipe = getArguments().getParcelable(ARG_ID);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recipe, container, false);

        TextView textView = view.findViewById(R.id.title);
        ImageView imageView = view.findViewById(R.id.image);
        textView.setText(recipe.getTitle());

        Glide.with(this)
                .load(recipe.getImageUrl())
                .into(imageView);

        return view;
    }
}