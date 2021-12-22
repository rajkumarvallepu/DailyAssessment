package com.htd.strings;
import java.util.*;

public class LengthOfString {
	public static void main(String [ ] args)
    {
        String s = new String();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a string");
        s = scn.nextLine();   
        System.out.println("Entered String is: "+s);
        System.out.println("String length is:"+s.length());
        scn.close();
    }
}
