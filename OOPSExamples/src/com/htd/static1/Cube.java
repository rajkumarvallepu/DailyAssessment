package com.htd.static1;

public class Cube {
	 int length = 10;
     int breadth = 10;
     int height = 10;
     public static int numOfCubes = 0; // static variable
     public static int getNoOfCubes()
     {     //static method
         return numOfCubes;
     }
     public Cube()
     {    numOfCubes++; //
     }
 }
