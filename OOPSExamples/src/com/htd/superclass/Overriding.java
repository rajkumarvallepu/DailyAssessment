package com.htd.superclass;

public class Overriding {
	 public void show()
     {    System.out.println("base class method");
     }
 }
 class Derived1 extends Overriding
 {    public void show()
     {    System.out.println("Derived1 class method");
     }
 }
 class Derived2 extends Derived1
 {    public void show()
     {    System.out.println("Derived2 class method");
     }
 }
 class OverRide
 {    public static void main(String [ ]args)
     {    Overriding b = new Overriding();
         Derived1 d1  =new Derived1();
         Derived2 d2 = new Derived2();
         b.show();      d1.show();  d2.show();
     }
}
