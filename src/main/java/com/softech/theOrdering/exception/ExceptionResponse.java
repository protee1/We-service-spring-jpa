package com.softech.theOrdering.exception;

import java.util.Date;

public class ExceptionResponse {
private String message;
private String detail;
private Date date;
public ExceptionResponse(Date date,String message, String detail) {
	super();
	this.message = message;
	this.detail = detail;
	this.date = date;
}
public String getMessage() {
	return message;
}
public String getDetail() {
	return detail;
}
public Date getTimestamp() {
	return date;
}
}
