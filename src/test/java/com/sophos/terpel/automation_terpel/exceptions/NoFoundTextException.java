package com.sophos.terpel.automation_terpel.exceptions;

public class NoFoundTextException extends AssertionError{
	public static final long serialVersionUID = 1L;

	public NoFoundTextException(String message, Throwable cause) {
		super(message, cause);
	}

}
