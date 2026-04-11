package com.example.miniimdb;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.miniimdb.model.Actor;
import com.example.miniimdb.model.Movie;
import com.example.miniimdb.utils.FavoritesManager;

public class MovieDetailsActivity extends AppCompatActivity {
    private ImageView imageDetailPoster;
    private TextView textDetailTitle;
    private TextView textDetailGenre;
    private TextView textDetailRating;
    private TextView textDetailDescription;
    private LinearLayout layoutActorsContainer;
    private Button buttonFavorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        imageDetailPoster = findViewById(R.id.imageDetailPoster);
        textDetailTitle = findViewById(R.id.textDetailTitle);
        textDetailGenre = findViewById(R.id.textDetailGenre);
        textDetailRating = findViewById(R.id.textDetailRating);
        textDetailDescription = findViewById(R.id.textDetailDescription);
        layoutActorsContainer = findViewById(R.id.layoutActorsContainer);
        buttonFavorite = findViewById(R.id.buttonFavorite);

        Movie movie = (Movie) getIntent().getSerializableExtra("movie");

        if (movie != null) {
            imageDetailPoster.setImageResource(movie.getPosterResId());
            textDetailTitle.setText(movie.getTitle());
            textDetailGenre.setText(movie.getGenre());
            textDetailRating.setText("Rating: " + movie.getRating());
            textDetailDescription.setText(movie.getDescription());

            updateFavoriteButton(movie);

            buttonFavorite.setOnClickListener(v -> {
                if (FavoritesManager.isFavorite(movie)) {
                    FavoritesManager.removeFromFavorites(movie);
                    Toast.makeText(this, "Removed from Favorites", Toast.LENGTH_SHORT).show();
                } else {
                    FavoritesManager.addToFavorites(movie);
                    Toast.makeText(this, "Added to Favorites", Toast.LENGTH_SHORT).show();
                }
                updateFavoriteButton(movie);
            });

            for (Actor actor : movie.getActors()) {
                TextView actorText = new TextView(this);
                actorText.setText(". " + actor.getName());
                actorText.setTextSize(16f);
                actorText.setPadding(0, 8, 0, 8);
                layoutActorsContainer.addView(actorText);
            }
        }
    }
    private void updateFavoriteButton(Movie movie) {
        if (FavoritesManager.isFavorite(movie)) {
            buttonFavorite.setText("Remove from Favorites");
        } else {
            buttonFavorite.setText("Add to Favorites");
        }
    }
}