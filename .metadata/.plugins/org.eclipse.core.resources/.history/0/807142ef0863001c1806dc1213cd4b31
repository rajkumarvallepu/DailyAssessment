package com.files;
import java.io.*;

public class ReadingTextFile {
	public static void main(String [ ]a) throws Exception
    {  File f = new File("C:\\Users\\Omen 15\\Documents\\EclipseEE\\JavaOOPS\\Files","file.txt");
       FileReader fr = new FileReader(f);
       LineNumberReader lnr = new LineNumberReader(fr);
      int i;
      String s;
      while((s=lnr.readLine())!=null)
      {    i = lnr.getLineNumber();
        System.out.println(i+" "+s);
      }
    }
}
