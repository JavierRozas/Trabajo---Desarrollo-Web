package com.hampcode.api.viewmodel;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MovieViewModel {

	private Long id;

	@NotNull
	@Min(3)
	private String name;

	@NotNull
	private String sinopsis;
	
	private String trailer;
	private Long imdb_id;
	private String slogan;
	private int duration;
	private int views;
	private String source;
	private float rental_price;
	private Date release_date;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String title) {
		this.name = title;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getTrailer() {
		return trailer;
	}
	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	public Long getImdb_id() {
		return imdb_id;
	}
	public void setImdb_id(Long imdb_id) {
		this.imdb_id = imdb_id;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public float getRental_price() {
		return rental_price;
	}
	public void setRental_price(float rental_price) {
		this.rental_price = rental_price;
	}
	public Date getRelease_date() {
		return release_date;
	}
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
	

}
