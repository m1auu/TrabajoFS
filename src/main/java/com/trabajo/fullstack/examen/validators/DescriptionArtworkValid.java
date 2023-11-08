package com.trabajo.fullstack.examen.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DescriptionArtworkValid implements ConstraintValidator<DescriptionArtworkValidator,String> {
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
	        
		if (value == null || value.trim().isEmpty()) {
			return false;
			}
		
		String[] palabras = value.split("\s+");
		return palabras.length >= 5;
	}
}
