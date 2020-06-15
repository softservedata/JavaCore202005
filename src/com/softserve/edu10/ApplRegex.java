package com.softserve.edu10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplRegex {
	public static void main(String[] args) {
		//
		// String pattern = "Now is the time";
//		String pattern = "[a-z]+";
//		String text = "Now is the time";
		//
//		String pattern = "\\Bb{2}\\B";
//		String text = "abba bba abb, cbbc";
//		String textUpdated = text.replaceAll("\\Bb{2}\\B", "++");
//		System.out.println("textUpdated = " + textUpdated);
		//
//		String pattern = "\\B(\\w)\\1\\B";
//		String text = "abba bba abb, cbbc, bccb";
//		String textUpdated = text.replaceAll("\\B(\\w)\\1\\B", "++");
//		System.out.println("textUpdated = " + textUpdated);
		//
		// String pattern = "<.+>"; // All Tags // Error
//		String pattern = "<[^>]+>"; // All Tags
//		String text = "<p><b>Beginning with <>bold text</b> next, <span>text</span> body,<i>italic text</i> end of text.</p>";
		//
//		String pattern = ">[^<]+<"; // All Text
//		String text = "<p><b>Beginning with <>bold text</b> next, <span>text</span> body,<i>italic text</i> end of text.</p>";
		//
//		String pattern = "<([^>]+)>[^<]+</\\1>"; // All Tags and Text
//		String text = "<p><b>Beginning with bold text</b> next, <span>text</span> body,<i>italic text</i> end of text.</p>";
		//
//		String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w{2,4}";
		//String text = "a.bcd.eF@gmail.com";
//		String text = "a.bcd.eF@gmail.com   i@i.ua  u.@gmail.com   u@ukr.net";
		//
		String pattern = "\\d{1,3}(,\\d{3})*\\.\\d{2}";
		String text = "3 item(s) - $10,327.20  Euro: 5 item(s) - 2,101,041.32E";
		//
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		//
		// 1.
		if (m.matches()) {
			System.out.println("m.matches() OK");
		}
		m.reset();
		//
		// 2.
		List<String> list = new ArrayList<>();
		while (m.find()) {
			String current = text.substring(m.start(), m.end());
			// String current = text.substring(m.start() + 1, m.end() - 1); // All Text
			list.add(current.trim());
			// System.out.print(text.substring(m.start(), m.end()) + "*");
		}
		for (String str : list) {
			System.out.println("str = " + str);
			double price = Double.valueOf(str.replace(",", ""));
			System.out.printf("Origin price = %.2f Updated = %f\n", price, (price + 0.01));
		}
	}
}
