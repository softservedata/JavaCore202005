package com.softserve.edu10;

public class Appl {
	public static void main(String[] args) {
		/*-
		String str = "I study Java language._Java-8";
		char c = str.charAt(8); // J
		System.out.println("8 c = " + c);
		int n = str.indexOf('J'); // 8
		System.out.println("J n = " + n);
		n = str.indexOf("ava"); // 8
		System.out.println("Start ava n = " + n);
		n = str.lastIndexOf("ava"); // 24
		System.out.println("Last ava n = " + n);
		//
		String str1 = str.substring(23); // Java-8
		String str2 = str.substring(8, 22);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		//
		Boolean res = str.startsWith("I study"); // true
		System.out.println("I study res = " + res);
		res = str.startsWith("Java", 8); // true
		System.out.println("Java 8 res = " + res);
		res = str.endsWith("_Java-8"); // false
		System.out.println("_Java-8 endsWith res = " + res);
		*/
		/*-
		String str = " \t\tTabulated String\t";
		System.out.println("str =" + str);
		String tStr = str.trim();
		System.out.println("tStr =" + tStr.toUpperCase());
		//
		str = "abracadabra";
		//String rStr = str.replace('a', '-');
		String rStr = str.replace("ab", "-*-");
		//String rStr = str.replaceFirst("a", "-");
		System.out.println("rStr = " + rStr);
		//
		String s1 = "Java"; // new String("Java");
		String s2 = "Java"; // new String("Java");
		String s3 = new String("Java");
		System.out.println("(s1 == s2) = " + (s1 == s2));
		System.out.println("(s1 == s3) = " + (s1 == s3));
		System.out.println("s1.equals(s2) = " + s1.equals(s2));
		System.out.println("s1.equals(s3) = " + s1.equals(s3));
		System.out.println("s1.compareTo(s2) = " + s1.compareTo(s2));
		System.out.println("s1.compareTo(s3) = " + s1.compareTo(s3));
		System.out.println("s1.hashCode() = " + s1.hashCode());
		System.out.println("s2.hashCode() = " + s2.hashCode());
		System.out.println("s3.hashCode() = " + s3.hashCode());
		//
		String a = "aaa";
		String aA = "AaA";
		String b = "aaa";
		StringBuilder sb = new StringBuilder("aaa");
		System.out.println("a.equals(aA) = " + a.equals(aA));
		System.out.println("a.equals(b) = " + a.equals(b));
		System.out.println("a.equalsIgnoreCase(aA) = " + a.equalsIgnoreCase(aA));
		System.out.println("a.compareTo(aA) = " + a.compareTo(aA));
		System.out.println("a.compareToIgnoreCase(A) = " + a.compareToIgnoreCase(aA));
		System.out.println("a.equals(sb) = " + a.equals(sb));
		System.out.println("a.contentEquals(sb) = " + a.contentEquals(sb));
		//
		int n = 48;
		System.out.println("n = " + n + " char = " + (char)n);
		//
		String str = "Java-SE_8";
		String[] arr = str.split("-|_");
		for (String word : arr) {
			System.out.println(word);
		}
		//
		final double PI = 3.1415926;
		String format = "Math %8s = %9.6f";
		String s = String.format(format, "Pi", PI);
		System.out.println(s);
		System.out.printf(format, "Pi", PI);
		*/
		String s1 = new String("Hello");
		String s2 = " And Goodbye";
		StringBuilder sb = new StringBuilder();
		System.out.println("1. sb.capacity() = " + sb.capacity()); // 16
		sb.append(s1);
		sb.append(s2);
		System.out.println("2. sb.capacity() = " + sb.capacity()); // 34
		String str = sb.toString();
		System.out.println("str = " + str);
		sb.ensureCapacity(5); // Ignore
		System.out.println("Ignore sb.capacity() = " + sb.capacity());
		sb.setLength(5);
		sb.ensureCapacity(5);
		System.out.println("3. sb.capacity() = " + sb.capacity());
		System.out.println("str = " + sb);
		sb.setLength(10); // Add Spaces
		sb.ensureCapacity(65);
		System.out.println("4. sb.capacity() = " + sb.capacity());
		System.out.println("str = " + sb);
		//
	}
}
