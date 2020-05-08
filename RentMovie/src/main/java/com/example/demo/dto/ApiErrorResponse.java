package com.example.demo.dto;

public class ApiErrorResponse {

	private final int errorCode;
	private final String errorDescription;

	public ApiErrorResponse(int errorCode, String errorDescription) {
		super();
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

}
