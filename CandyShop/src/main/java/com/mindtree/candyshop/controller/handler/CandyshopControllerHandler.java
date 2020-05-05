package com.mindtree.candyshop.controller.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.mindtree.candyshop.exception.CandyShopException;
import com.mindtree.candyshop.dto.*;

@RestControllerAdvice
public class CandyshopControllerHandler {

	@Autowired
	MessageSource messageSource;

	@ExceptionHandler(CandyShopException.class)
	public ResponseEntity<?> errorHandler(Exception e) {
		return new ResponseEntity<ResponseBody<Void>>(
				new ResponseBody<Void>(null, new ErrorDto(e.getMessage(), e.getCause()), "Error in Application", false),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
		String errorMessage = "";
		for (ObjectError error : ex.getBindingResult().getAllErrors()) {
			errorMessage += error.getDefaultMessage() + ", ";
		}

		return new ResponseEntity<ResponseBody<Void>>(
				new ResponseBody<Void>(null, new ErrorDto(errorMessage, ex.getCause()), "Error in Application", false),
				HttpStatus.BAD_REQUEST);

	}

}

