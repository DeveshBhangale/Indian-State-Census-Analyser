package com.bridgelabz.censusanalyser;

public class CSVStateCensus {
	public String state;
    public long population;
    public long areaInSqKm;
    public Integer densityPerSqKm;

    
    public CSVStateCensus(String state, long population, long areaInSqKm, Integer densityPerSqKm) {
        this.state = state;
        this.population = population;
        this.areaInSqKm = areaInSqKm;
        this.densityPerSqKm = densityPerSqKm;
    }

    
	@Override
	public String toString() {
		return "CSVStateCensus [state=" + state + ", population=" + population + ", areaInSqKm=" + areaInSqKm
				+ ", densityPerSqKm=" + densityPerSqKm + "]";
	}

}
