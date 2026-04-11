package com.example.miniimdb;

import android.os.Bundle;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import com.example.miniimdb.adapter.MovieAdapter;
import com.example.miniimdb.model.Movie;
import com.example.miniimdb.utils.FavoritesManager;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    private RecyclerView recyclerViewFavorites;
    private MovieAdapter movieAdapter;
    private ArrayList<Movie> favoriteMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        Toolbar toolbarFavorites = findViewById(R.id.toolbarFavorites);
        setSupportActionBar(toolbarFavorites);

        recyclerViewFavorites = findViewById(R.id.recyclerViewFavorites);
        favoriteMovies = FavoritesManager.getFavoriteMovies();

        movieAdapter = new MovieAdapter(favoriteMovies, movie -> {
            Intent intent = new Intent(FavoritesActivity.this, MovieDetailsActivity.class);
            intent.putExtra("movie", movie);
            startActivity(intent);
        });

        recyclerViewFavorites.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFavorites.setAdapter(movieAdapter);
    }
    @Override
    protected void onResume() {
        super.onResume();
        favoriteMovies = FavoritesManager.getFavoriteMovies();
        movieAdapter.updateList(favoriteMovies);
    }
}