package com.htd.operators;

public class UnaryOperator {
	public static void main(String[ ] args)
    {
         int number = 1;
         int number1 = 0;
         
         System.out.println("result is now:" +number);
         
         number = -number;
         
         System.out.println("result is now:" +number);
       
         ++number;
        
         System.out.println("result is now:" +number);
        
         number1=number++;
        
         System.out.println("result is now:" +number);
         System.out.println("result of number1 is:" +number1);
        
         boolean result = (2>1);
        
         System.out.println("2 is geater than 1: "+result);
         System.out.println("2 is geater than 1: "+!result);
   }

}
