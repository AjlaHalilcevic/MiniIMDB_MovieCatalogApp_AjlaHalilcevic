package com.example.miniimdb;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.miniimdb.model.Actor;
import com.example.miniimdb.model.Movie;

public class MovieDetailsActivity extends AppCompatActivity {
    private ImageView imageDetailPoster;
    private TextView textDetailTitle;
    private TextView textDetailGenre;
    private TextView textDetailRating;
    private TextView textDetailDescription;
    private LinearLayout layoutActorsContainer;

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

        Movie movie = (Movie) getIntent().getSerializableExtra("movie");

        if (movie != null) {
            imageDetailPoster.setImageResource(movie.getPosterResId());
            textDetailTitle.setText(movie.getTitle());
            textDetailGenre.setText(movie.getGenre());
            textDetailRating.setText("Rating: " + movie.getRating());
            textDetailDescription.setText(movie.getDescription());

            for (Actor actor : movie.getActors()) {
                TextView actorText = new TextView(this);
                actorText.setText(". " + actor.getName());
                actorText.setTextSize(16f);
                actorText.setPadding(0, 8, 0, 8);
                layoutActorsContainer.addView(actorText);
            }
        }
    }
}