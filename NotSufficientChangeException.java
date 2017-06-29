package com.prep.Vending;

public class NotSufficientChangeException extends Exception {
private String message; 
	
	public NotSufficientChangeException(String string) 
	{ 
		this.message = string; 
		
	} 
	
	@Override 
	public String getMessage()
	{ return message; }
}
