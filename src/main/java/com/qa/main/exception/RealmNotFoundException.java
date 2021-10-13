package com.qa.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "No realm at that id")
public class RealmNotFoundException extends RuntimeException{


	/**
	 * 
	 */
	private static final long serialVersionUID = -4680570176905426408L;

	public RealmNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RealmNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public RealmNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RealmNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RealmNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
