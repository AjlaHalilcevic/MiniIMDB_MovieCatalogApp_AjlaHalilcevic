package com.example.miniimdb;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
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
    private RatingBar ratingBarMovie;

    private Movie movie;
    private float currentRating = -1f;

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
        ratingBarMovie = findViewById(R.id.ratingBarMovie);

        movie = (Movie) getIntent().getSerializableExtra("movie");

        if (movie != null) {
            imageDetailPoster.setImageResource(movie.getPosterResId());
            textDetailTitle.setText(movie.getTitle());
            textDetailGenre.setText(movie.getGenre());
            textDetailRating.setText("Rating: " + movie.getRating());
            textDetailDescription.setText(movie.getDescription());

            currentRating = movie.getRating();

            float appRating = movie.getRating() / 2.0f;
            ratingBarMovie.setRating(appRating);

            ratingBarMovie.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
                if (fromUser) {
                    currentRating = rating * 2.0f;
                    textDetailRating.setText("Rating: " + currentRating);
                    Toast.makeText(this, "Rating updated", Toast.LENGTH_SHORT).show();
                }
            });

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
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                sendResultFinish();
            }
        });
    }
    private void updateFavoriteButton(Movie movie) {
        if (FavoritesManager.isFavorite(movie)) {
            buttonFavorite.setText("Remove from Favorites");
        } else {
            buttonFavorite.setText("Add to Favorites");
        }
    }
    private void sendResultFinish() {
        if (movie != null && currentRating >= 0f) {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("movieTitle", movie.getTitle());
            resultIntent.putExtra("updatedRating", currentRating);
            setResult(RESULT_OK, resultIntent);
        }
        finish();
    }
}