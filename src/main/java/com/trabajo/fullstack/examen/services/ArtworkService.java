package com.trabajo.fullstack.examen.services;

import java.util.ArrayList;

import com.trabajo.fullstack.examen.model.ArtworkDTO;

public interface ArtworkService {

	//Retorna una lista con todas las obras de arte
	ArrayList<ArtworkDTO> getAllArtworks();
	
	//Guarda una nueva obra de arte basada en los datos de artworkDTO
	void createArtwork(ArtworkDTO artworkDTO);

}
