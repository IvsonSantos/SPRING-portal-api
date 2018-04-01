package com.ivson.spring.service.exception;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	/**
	 * Contrutor que tras a mensagem de causa
	 * @param msg
	 * @param cause
	 */
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg);
	}
}
