package com.nt.pojo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionClass 
 {
	@ExceptionHandler(InvalidDestinationNameException.class)
	public String inavildDestException( InvalidDestinationNameException ex) {
		
		return "Invalid dest";
	}
}
