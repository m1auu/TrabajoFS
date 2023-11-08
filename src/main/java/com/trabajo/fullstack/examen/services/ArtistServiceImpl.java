package com.trabajo.fullstack.examen.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.trabajo.fullstack.examen.model.ArtistDTO;

@Service
public class ArtistServiceImpl implements ArtistService {
	 
	ArrayList<ArtistDTO> artistas = new ArrayList<>();

	    ArtistDTO ar = new ArtistDTO(1, "Goya");
	    ArtistDTO ar2 = new ArtistDTO(2, "Picasso");
	    ArtistDTO ar3 = new ArtistDTO(3, "Dalí");
	    ArtistDTO ar4 = new ArtistDTO(4, "Miró");

	    public ArtistServiceImpl(){
	        artistas.add(ar);
	        artistas.add(ar2);
	        artistas.add(ar3);
	        artistas.add(ar4);
	    }
	 
	    @Override
	    public ArtistDTO getArtistById(Integer id) {
	        for (ArtistDTO art : artistas ) {
	            return art;
	        }
	        return null;
	    }
	    
}
