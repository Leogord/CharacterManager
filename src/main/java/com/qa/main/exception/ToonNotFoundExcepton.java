package com.qa.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "No Character at that id")
public class ToonNotFoundExcepton extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6857144369113754786L;

	public ToonNotFoundExcepton() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ToonNotFoundExcepton(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ToonNotFoundExcepton(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ToonNotFoundExcepton(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ToonNotFoundExcepton(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
