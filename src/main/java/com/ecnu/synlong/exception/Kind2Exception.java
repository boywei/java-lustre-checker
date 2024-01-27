package com.ecnu.synlong.exception;

public class Kind2Exception extends RuntimeException{

	public Kind2Exception(String message) {
		super(message);
	}

	public Kind2Exception(String message, Throwable t) {
		super(message, t);
	}
}
