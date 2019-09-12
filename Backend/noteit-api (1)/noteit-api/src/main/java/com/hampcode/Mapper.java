package com.hampcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hampcode.api.viewmodel.MovieViewModel;

import com.hampcode.model.Movie;
import com.hampcode.repository.MovieRepository;

@Component
public class Mapper {

	@Autowired
	private MovieRepository movieRepository;

	public MovieViewModel convertToMovieViewModel(Movie entity) {
		MovieViewModel viewModel = new MovieViewModel();
		viewModel.setName(entity.getName());
		viewModel.setId(entity.getId());
		viewModel.setSinopsis(entity.getSinopsis());
		viewModel.setTrailer(entity.getTrailer());
		viewModel.setImdb_id(entity.getImdb_id());
		viewModel.setSlogan(entity.getSlogan());
		viewModel.setDuration(entity.getDuration());
		viewModel.setViews(entity.getViews());
		viewModel.setSource(entity.getSource());
		viewModel.setRental_price(entity.getRental_price());
		viewModel.setRelease_date(entity.getRelease_date());
		return viewModel;
	}
	


}
