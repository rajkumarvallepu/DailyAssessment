package com.htd.operators;

public class ComparisonOperators {
	public static void main(String[ ] args){
		int x=5;
		int y=10;
		
		x += y;
        System.out.println("The addition is:"+ x);
 
        x -= y;
        System.out.println("The subtraction is:"+ x);
 
        x *= y;
        System.out.println("The multiplication is:"+ x);
 
        x /= y;
        System.out.println("The division is"+ x);
 
        x %= y;
        System.out.println("The remainder is:"+x);
 
        x &= y;
        System.out.println("The result of AND operation :"+ x);
 
        x |= y;
        System.out.println("The result of Bitwise inclusive OR operation :"+ x);
 
        x <<= y;
        System.out.println("The result of Signed left shift operation :"+ x);
     }
}
