package com.nt.pojo;

public class InvalidDestinationNameException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	    public InvalidDestinationNameException() {
			super(String.format("User with Destination  name not Valid "));

	    }
	

}
