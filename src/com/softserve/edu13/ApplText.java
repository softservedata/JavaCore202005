package com.softserve.edu13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ApplText {
	public static void main(String[] args) {
		String fileName = "C:/1/file.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		String data = "Some data to be written and readed\r\n";
		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write("Hello World\r\n");
			bw.write("Data\r\n");
			System.out.println("Write data to file: " + fileName);
			for (int i = (int) (Math.random() * 10); --i >= 0;) {
				bw.write("i=" + i + "  " + data);
			}
			bw.close();
			//
			fr = new FileReader(fileName);
			//fr = new FileReader("C:/1/12.zip");
			br = new BufferedReader(fr);
			String s = null;
			int count = 0;
			System.out.println("Read data from file: " + fileName);
			while ((s = br.readLine()) != null) {
				System.out.println("row " + ++count + " read: " + s);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}
	}
}
