package com.example.RestExample.exceptions;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	UserNotFoundException(Integer id) {
	    super("Could not find user " + id);
	  }
}
