package com.trabajo.fullstack.examen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtworkDTO {

	private Integer id;
	private String title;
	private Integer artistId;
	
	//validacion
	private String description;

	
	//No funciona Lombok por lo que hago a mano el constructor
	//los getters y los setters
	
	public ArtworkDTO(Integer id, String title, String description, Integer artistId) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.artistId = artistId;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getArtistId() {
		return artistId;
	}


	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}
	
	
	
	
}
