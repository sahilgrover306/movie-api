package dev.sahil.movies;

import dev.sahil.movies.repo.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> findAllMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> findMovieByImdbId(String id) {
        return movieRepository.findMovieByImdbId(id);
    }
}
