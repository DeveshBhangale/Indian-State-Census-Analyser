package com.bridgelabz.censusanalyser;



@SuppressWarnings("serial")
public class StateCensusAnalyserException extends Exception{
	
	ExceptionType type;
	public StateCensusAnalyserException(String message,ExceptionType type) {
        super(message);
        this.type=type;
	}
	
	enum ExceptionType{
		Parse_Error,File_Not_Found
	}
}
