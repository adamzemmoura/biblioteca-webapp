package com.adamzemmoura.biblioteca.data;

import com.adamzemmoura.biblioteca.model.Movie;
import com.adamzemmoura.biblioteca.model.MovieRating;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MovieRepository {

    private final List<Movie> ALL_MOVIES = Arrays.asList(
            new Movie("The Godfather", "1972", "Francis Ford Coppola", MovieRating.FIVE),
            new Movie("The Shawshank Redemption", "1994", "Frank Darabont", MovieRating.THREE),
            new Movie("Schindler's List", "1993", "Steven Spielberg", MovieRating.FIVE),
            new Movie("Raging Bull", "1980", "Martin Scorsese", MovieRating.FOUR),
            new Movie("Casablanca", "1946", "Michael Curtiz", MovieRating.ONE)
    );

    public List<Movie> getAllMovies() {
        return ALL_MOVIES;
    }

}
