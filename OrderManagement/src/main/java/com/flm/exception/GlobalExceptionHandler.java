package com.flm.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.validation.ConstraintViolationException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleOrderNotFound(OrderNotFoundException ex){
		ErrorResponse errorResponse =
                new ErrorResponse(
                        HttpStatus.NOT_FOUND.value(),
                        ex.getMessage()
                );

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleValidationException(
			MethodArgumentNotValidException ex){
		String message = ex.getBindingResult()
				.getFieldErrors()
				.stream()
				.map(error->error.getField()+": "+error.getDefaultMessage())
				.findFirst()
				.orElse("Invalid request");
		ErrorResponse error = new ErrorResponse(
	            HttpStatus.BAD_REQUEST.value(),
	            message
	    );

	    return ResponseEntity
	            .status(HttpStatus.BAD_REQUEST)
	            .body(error);
	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<ErrorResponse> handleConstraintViolation(
	        ConstraintViolationException ex) {

	    String message = ex.getConstraintViolations()
	            .stream()
	            .map(violation ->
	                    violation.getPropertyPath() + ": "
	                    + violation.getMessage())
	            .findFirst()
	            .orElse("Validation failed");

	    ErrorResponse error = new ErrorResponse(
	            HttpStatus.BAD_REQUEST.value(),
	            message
	    );

	    return ResponseEntity
	            .status(HttpStatus.BAD_REQUEST)
	            .body(error);
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<ErrorResponse> handleInvalidJson(
	        HttpMessageNotReadableException ex) {

	    ErrorResponse error = new ErrorResponse(
	            HttpStatus.BAD_REQUEST.value(),
	            "Invalid JSON request"
	    );

	    return ResponseEntity
	            .status(HttpStatus.BAD_REQUEST)
	            .body(error);
	}
}
