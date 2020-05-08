package com.example.demo.enums;

public enum ErrorResponse {

	USER_NOT_FOUND(999, "User not found"), MOVIE_NOT_FOUND(555, "Movie not found");
	

	private final int code;
	private final String desc;

	ErrorResponse(int errorCode, String errorDescription) {
		this.code = errorCode;
		this.desc = errorDescription;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	
	
}
