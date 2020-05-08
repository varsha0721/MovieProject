package com.example.demo.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.dto.ApiErrorResponse;
import com.example.demo.exception.NotFoundException;

@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(value = NotFoundException.class)
	public ResponseEntity<Object> exception(NotFoundException exception) {
		return new ResponseEntity<>(new ApiErrorResponse(exception.getErrorCode(), exception.getErrorDesc()),
				HttpStatus.NOT_FOUND);
	}
}
