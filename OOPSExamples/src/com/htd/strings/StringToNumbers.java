package com.htd.strings;

public class StringToNumbers {
	 public static void main(String[ ] args)
     {
         if (args.length == 2)
         {    //convert strings to numbers
                 float a = (Float.valueOf(args[0]) ).floatValue();
                 float b = (Float.valueOf(args[1]) ).floatValue();
                 System.out.println("a + b = " + (a + b) );
                 System.out.println("a - b = " + (a - b) );
                 System.out.println("a * b = " + (a * b) );
                 System.out.println("a / b = " + (a / b) );
                 System.out.println("a % b = " + (a % b) );
             }
     else
     {
  System.out.println("This program requires two command-line arguments.");
          }
         }
}
