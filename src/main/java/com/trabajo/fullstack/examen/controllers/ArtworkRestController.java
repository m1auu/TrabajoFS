package com.trabajo.fullstack.examen.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.trabajo.fullstack.examen.model.ArtworkDTO;
import com.trabajo.fullstack.examen.services.ArtworkService;

@RestController
@RequestMapping("/artworks")
public class ArtworkRestController {

	@Autowired //Inyeccion de dependencia
	ArtworkService artworkService;
	
	@PostMapping()
	public ResponseEntity<?> createArtwork(@RequestBody @Validated ArtworkDTO artwork){
		
		artworkService.createArtwork(artwork);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(artwork.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();		
		
	}
	
	@GetMapping()
	public ResponseEntity<?> getAllArtworks(){
		return ResponseEntity.ok(artworkService.getAllArtworks());
	}
	

	
}
