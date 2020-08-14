package com.techelevator.auctions.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( code = HttpStatus.NO_CONTENT, reason = "No Content")
public class NoContentException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoContentException(){
		super("No Content");
    }
}