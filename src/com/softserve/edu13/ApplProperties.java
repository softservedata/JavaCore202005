package com.softserve.edu13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ApplProperties {
	public static void main(String[] args) {
//		Properties prop = new Properties();
//		String propFileName = "config.properties";
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream("config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("username: " + prop.getProperty("username"));
		System.out.println("password: " + prop.getProperty("password"));
		System.out.println("email: " + prop.getProperty("email", "empty"));
	}
}
