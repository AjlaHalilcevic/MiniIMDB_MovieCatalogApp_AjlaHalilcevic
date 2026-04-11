package com.example.miniimdb;

import android.os.Bundle;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miniimdb.adapter.MovieAdapter;
import com.example.miniimdb.data.MovieData;
import com.example.miniimdb.model.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewMovies;
    private EditText editTextSearch;
    private Button buttonOpenFavorites;
    private ArrayList<Movie> fullMovieList;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewMovies = findViewById(R.id.recyclerViewMovies);
        editTextSearch = findViewById(R.id.editTextSearch);
        buttonOpenFavorites = findViewById(R.id.buttonOpenFavorites);

        fullMovieList = MovieData.getMovies();

        movieAdapter = new MovieAdapter(new ArrayList<>(fullMovieList), movie -> {
            Intent intent = new Intent(MainActivity.this, MovieDetailsActivity.class);
            intent.putExtra("movie", movie);
            startActivity(intent);
        });

        recyclerViewMovies.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewMovies.setAdapter(movieAdapter);

        editTextSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterMovies(s.toString().trim());

            }
        });
        buttonOpenFavorites.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FavoritesActivity.class);
            startActivity(intent);
        });
    }

    private void filterMovies(String query) {
        ArrayList<Movie> filteredList = new ArrayList<>();

        if (query.isEmpty()) {
            filteredList.addAll(fullMovieList);
        } else{
            for (Movie movie : fullMovieList) {
                if (movie.getTitle().toLowerCase().contains(query.toLowerCase())) {
                    filteredList.add(movie);
                }
            }
        }
        movieAdapter.updateList(filteredList);
    }
}