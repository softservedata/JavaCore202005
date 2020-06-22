package com.softserve.edu13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ApplFileUtils {
	public static void main(String[] args) {
		//FileUtils f;
		String s = "+++";
		try {
			s = FileUtils.readFileToString(new File("C:/1/file.txt"), "UTF8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
	}
}
