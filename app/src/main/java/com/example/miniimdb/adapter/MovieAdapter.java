package com.example.miniimdb.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miniimdb.R;
import com.example.miniimdb.model.Movie;

import java.util.ArrayList;
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private final ArrayList<Movie> movieList;
    private final OnMovieClickListener listener;

    public interface OnMovieClickListener {
        void onMovieClick(Movie movie);
    }

    public MovieAdapter(ArrayList<Movie> movieList, OnMovieClickListener listener) {
        this.movieList = movieList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewTape) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = movieList.get(position);

        holder.textMovieTitle.setText(movie.getTitle());
        holder.textMovieGenre.setText(movie.getGenre());
        holder.textMovieRating.setText("Rating: " + movie.getRating());
        holder.imageMoviePoster.setImageResource(movie.getPosterResId());

        holder.itemView.setOnClickListener(v -> listener.onMovieClick(movie));
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        ImageView imageMoviePoster;
        TextView textMovieTitle, textMovieGenre, textMovieRating;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            imageMoviePoster = itemView.findViewById(R.id.imageMoviePoster);
            textMovieTitle = itemView.findViewById(R.id.textMovieTitle);
            textMovieGenre = itemView.findViewById(R.id.textMovieGenre);
            textMovieRating = itemView.findViewById(R.id.textMovieRating);
        }
    }
}
