package com.htd.superclass;

public class SuperDemo { 
	      public SuperDemo() {
			// TODO Auto-generated constructor stub
	    	  System.out.println ("super");
	      }
}
	      
class extend extends SuperDemo{
	public extend(){
		super ();
	    System.out.println("sub");
	    }
}
