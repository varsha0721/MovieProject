package com.example.demo.exception;

import com.example.demo.enums.ErrorResponse;

public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private int errorCode;
	private String errorDesc;

	public NotFoundException(ErrorResponse errorResponse) {
		this.errorCode = errorResponse.getCode();
		this.errorDesc = errorResponse.getDesc();
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

}
