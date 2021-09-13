package com.bridgelabz.censusanalyser;


import org.junit.Assert;
import org.junit.Test;

public class StateCensusAnalyserTest {
	private static final String INDIA_CENSUS_CSV_FILE_PATH = "./src/test/resources/IndiaStateCensusData.csv";
	public StateCensusAnalyser stateCensusAnalyser;
	
	@Test
	public void ShouldReturnSize() throws Exception {
		try {
			stateCensusAnalyser = new StateCensusAnalyser();
			Assert.assertEquals(29, stateCensusAnalyser.loadData(INDIA_CENSUS_CSV_FILE_PATH));
		}catch(StateCensusAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void ShouldExecuteProperly_IfRecordsAreEqual() throws Exception {
		try {
			stateCensusAnalyser = new StateCensusAnalyser();
			Assert.assertEquals(29, stateCensusAnalyser.loadData(INDIA_CENSUS_CSV_FILE_PATH));
		}catch(StateCensusAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void willReturnRecordsOnlyif_CSVFileIsDetected() throws Exception {
		try {
			stateCensusAnalyser = new StateCensusAnalyser();
			Assert.assertEquals(29, stateCensusAnalyser.loadData(INDIA_CENSUS_CSV_FILE_PATH));
		}catch(StateCensusAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void ifDelimiterIncorrect_WillReturnCustomException() throws Exception {
		try {
			stateCensusAnalyser = new StateCensusAnalyser();
			Assert.assertEquals(29, stateCensusAnalyser.loadData(INDIA_CENSUS_CSV_FILE_PATH));
		}catch(StateCensusAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void ifCSVHeaderIncorrect_WillReturnCustomException() throws Exception {
		try {
			stateCensusAnalyser = new StateCensusAnalyser();
			Assert.assertEquals(29, stateCensusAnalyser.loadData(INDIA_CENSUS_CSV_FILE_PATH));
		}catch(StateCensusAnalyserException e) {
			e.printStackTrace();
		}
	}
	
	
}
