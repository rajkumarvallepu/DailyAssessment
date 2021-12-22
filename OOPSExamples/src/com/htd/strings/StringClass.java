package com.htd.strings;

public class StringClass {
	public static void main(String args[])
    {
      String s1="RAJA SEKHAR";
      String s2="RAJ";
      String s3="HA";
      System.out.println("String 1 "+s1);
      System.out.println("String 1 "+s2);
      System.out.println("String 1 "+s3);
      System.out.println("String 1 Length "+s1.length());
      System.out.println("String 1 is begins with String 2 "+s1.startsWith(s2));
      System.out.println("String 1 is ends with String 3 "+s1.endsWith(s3));
      System.out.println("String 3 Position in Stirng 1 "+s1.indexOf(s2));
      System.out.println("String 1 Upper Case "+s1.toUpperCase());
    }
}
