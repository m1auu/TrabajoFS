package com.trabajo.fullstack.examen.services;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabajo.fullstack.examen.exceptions.ArtworkCreationException;
import com.trabajo.fullstack.examen.model.ArtworkDTO;

@Service
public class ArtworkServiceImpl implements ArtworkService{

	@Autowired //Inyeccion
	ArtistService artistService;
	
	ArrayList<ArtworkDTO> obras = new ArrayList<>();

	ArtworkDTO ar = new ArtworkDTO(1, "Titulo1", "hola soy la descripción uno", 1);
	ArtworkDTO ar2 = new ArtworkDTO(2, "Titulo2", "hola soy la descripción dos", 2);
	ArtworkDTO ar3 = new ArtworkDTO(3, "Titulo3", "hola soy la descripción tres", 1);
	ArtworkDTO ar4 = new ArtworkDTO(4,"Titulo4", "hola soy la descripción cuatro",3);

	public ArtworkServiceImpl() {
		obras.add(ar);
		obras.add(ar2);
		obras.add(ar3);
		obras.add(ar4);
	}

	@Override
	public ArrayList<ArtworkDTO> getAllArtworks(){
		return obras;
	}
	
	@Override
	public void createArtwork(ArtworkDTO artwork) {
		if(artistService.getArtistById(artwork.getArtistId())!=null) {
			obras.add(artwork);
		}else {
			throw new ArtworkCreationException ("No se puede crear una nueva obra de arte con un artista que no existe.");
		}
		
	}
	
}
