package com.bridgelabz.censusanalyser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import com.opencsv.CSVReader;


public class StateCensusAnalyser {
	public static List<CSVStateCensus> stateCensusList = new ArrayList<>();
	
	public int loadData(String filePath) throws Exception{
		try{
			stateCensusList = new ArrayList<>();
			CSVReader reader = new CSVReader(new FileReader(filePath));  
			List<String[]> data = reader.readAll();
			data.stream().forEach(n->{
				Iterator<String> iterate = Arrays.stream(n).iterator();
				String state = iterate.next();
				String population = iterate.next();
	            String areaInSqKm = iterate.next();
	            String densityPerSqKm = iterate.next();
	            if(!population.equals("Population"))
	            	stateCensusList.add(new CSVStateCensus(state, Long.parseLong(population), Long.parseLong(areaInSqKm), Integer.parseInt(densityPerSqKm)));
			});
			reader.close();
		}catch(FileNotFoundException e) {
			throw new StateCensusAnalyserException(e.getMessage(),StateCensusAnalyserException.ExceptionType.File_Not_Found);
		}
		catch(IllegalStateException  e) {
			throw new StateCensusAnalyserException(e.getMessage(),StateCensusAnalyserException.ExceptionType.Parse_Error);
		}
		return stateCensusList.size();
	}
	
}
