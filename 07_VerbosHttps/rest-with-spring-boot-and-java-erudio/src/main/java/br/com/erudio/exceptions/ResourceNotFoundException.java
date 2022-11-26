package br.com.erudio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(String msg) {
		super(msg);
	}

	private static final long serialVersionUID = 1L;

}