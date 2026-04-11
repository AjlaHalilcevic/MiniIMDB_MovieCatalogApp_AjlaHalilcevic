package com.example.miniimdb.utils;

import com.example.miniimdb.model.Movie;

import java.util.ArrayList;

public class FavoritesManager {
    private static final ArrayList<Movie> favoriteMovies = new ArrayList<>();

    public static void addToFavorites(Movie movie) {
        if (!isFavorite(movie)) {
            favoriteMovies.add(movie);
        }
    }

    public static void removeFromFavorites(Movie movie) {
        for (int i = 0; i < favoriteMovies.size(); i++) {
            if (favoriteMovies.get(i).getTitle().equals(movie.getTitle())) {
                favoriteMovies.remove(i);
                break;
            }
        }
    }

    public static boolean isFavorite(Movie movie) {
        for (Movie favorite : favoriteMovies) {
            if (favorite.getTitle().equals(movie.getTitle())) {
                return true;
            }
        }
        return false;
    }
    public static ArrayList<Movie> getFavoriteMovies() {
        return new ArrayList<>(favoriteMovies);
    }
}
