package com.trabajo.fullstack.examen.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = DescriptionArtworkValid.class)
public @interface DescriptionArtworkValidator {
	String message() default "Descripción inválido."
			+ "La descripción debe tener más de 5 carácteres.";
	Class<?>[] groups() default {};
	Class <? extends Payload>[] paylaod() default{};
}
