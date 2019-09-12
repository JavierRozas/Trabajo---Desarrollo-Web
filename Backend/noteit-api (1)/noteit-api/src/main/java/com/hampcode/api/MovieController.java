package com.hampcode.api;

import java.util.List;
import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hampcode.model.Movie;
import com.hampcode.repository.MovieRepository;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

	@Autowired
	private MovieRepository movieRepository;

	
	@GetMapping
	public List<Movie> all() {
		List<Movie> movies = this.movieRepository.findAll();
		return movies;
	}
	
	// Obtener la URL del video según ID
	@GetMapping("/source/{id}") 
	public String getSource(@PathVariable Long id) {
		Movie movies = this.movieRepository.findById(id).get();
		String source = movies.getSource();
		if (source == "") {
			return "URL Invalida.";
		} else {
			return source;
		}
	}
	

	@PostMapping
	public Movie save(@RequestBody Movie movie, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new ValidationException();
		}

		
		Movie newMovie = this.movieRepository.save(movie);

		return newMovie;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		this.movieRepository.deleteById(id);
	}

}
