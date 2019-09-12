package com.hampcode.model;

import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "movies")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String slogan;
	private String trailer;
	private Long imdb_id;
	private String sinopsis;
	private int duration;
	private int views;
	private String source;
	private float rental_price;
	private Date release_date;
	
	
	
	public Movie() {
		super();
	}

	public Movie(Long id, String name, String slogan, String trailer, Long imdb_id, String sinopsis, int duration,
			int views, String source, float rental_price, Date release_date) {
		super();
		this.id = id;
		this.name = name;
		this.slogan = slogan;
		this.trailer = trailer;
		this.imdb_id = imdb_id;
		this.sinopsis = sinopsis;
		this.duration = duration;
		this.views = views;
		this.source = source;
		this.rental_price = rental_price;
		this.release_date = release_date;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
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
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
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
