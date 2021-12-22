package com.htd.superclass;

public class MethodOver {
	public void show()
    {   
        System.out.println("show called with no parameters");
    }
    public void show(int a)
    {   
        System.out.println("Square root:"+Math.sqrt(a));
    }
    public void show(int a,int b)
    {   
        System.out.println("sum:"+(a+b));
    }
    public void show(float a,int b)
    {   
        System.out.println("Power value:"+Math.pow(a,b));
    }
}
