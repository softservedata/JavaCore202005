package com.softserve.hw12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CSVReader {
	private final String CSV_SPLIT_BY = ";";
	public final String FILE_NOT_FOUND_EXCEPTION = "File %s could not be found";
	public final String FILE_NOT_READ_EXCEPTION = "File %s could not be read";
	public final String FILE_NOT_CLOSE_EXCEPTION = "File %s could not be closed";
	
	public List<List<String>> getAllCells(String path) {
		List<List<String>> allCells = new ArrayList<List<String>>();
		String row;
		//
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(path));
			while ((row = bufferedReader.readLine()) != null) {
				allCells.add(Arrays.asList(row.split(CSV_SPLIT_BY)));
			}
		} catch (FileNotFoundException e) {
			// TODO Develop Custom Exceptions
			throw new RuntimeException(String.format(FILE_NOT_FOUND_EXCEPTION, path), e);
		} catch (IOException e) {
			throw new RuntimeException(String.format(FILE_NOT_READ_EXCEPTION, path), e);
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					throw new RuntimeException(String.format(FILE_NOT_CLOSE_EXCEPTION, path), e);
				}
			}
		}
		//
		// try with resources
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
//            while ((row = bufferedReader.readLine()) != null) {
//                allCells.add(Arrays.asList(row.split(CSV_SPLIT_BY)));
//            }
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }          
		//
		return allCells;
	}

}
