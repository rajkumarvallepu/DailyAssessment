package com.htd.modifiers;

public class Demo {
    int x;    //default : whose accessibility is through out the package
    private int y;    //as y is private it can not be seen out side the class
    public int z;    //whose visibility will be through out the program
    protected int p;    //whose visibility is to the derived classes of other packages
}
class modifiers
{
    public static void main(String args[ ])
    {
        Demo d= new Demo(); // constructor
        d.x=10;
//        d.y=20;
        d.z=100;
        d.p=150;
        System.out.println("  "+d.x+"    "+d.z+"   "+d.p);
    }
}
