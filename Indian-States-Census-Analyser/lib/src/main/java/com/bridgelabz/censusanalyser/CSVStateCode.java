package com.bridgelabz.censusanalyser;

public class CSVStateCode {
	public Integer SrNo;
	public String state;
	public Integer TIN;
	public String stateCode;
	
	
	public CSVStateCode(Integer srNo, String state, Integer tIN, String stateCode) {
		super();
		SrNo = srNo;
		this.state = state;
		this.TIN = tIN;
		this.stateCode = stateCode;
	}


	@Override
	public String toString() {
		return "CSVStateCode [SrNo=" + SrNo + ", state=" + state + ", TIN=" + TIN + ", stateCode=" + stateCode + "]";
	}
    
}
