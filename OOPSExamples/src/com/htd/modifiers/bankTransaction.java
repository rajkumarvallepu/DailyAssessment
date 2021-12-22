package com.htd.modifiers;
import java.util.*;

public class bankTransaction {
	 int bal=500,amount,n,id;
	    Scanner s=new Scanner(System.in);
	    String s1=new String();
	    bankTransaction()
	    {    System.out.println("Enter the name of the person:");
	        s1=s.nextLine();
	        System.out.println("Enter the person ID:");
	        id=s.nextInt();
	    }
	    public void deposit()
	    {    System.out.println("Enter amount to be deposited:");
	        amount=s.nextInt();     bal=bal+amount;
	    }
	    protected void draw()
	    {    if(bal>500)
	        {    System.out.println("Enter the amount to be draw:");
	            n=s.nextInt();
	            if(n%100==0)
	            {    bal=bal-n;
	                System.out.println("Draw amount is :"+n);
	            }
	            else      System.out.println("can not possible this amount:");
	        }
	        else     System.out.println("can not possible:");
	    }
	        public void enquiry()
	    {    System.out.println(" name of the person:"+s1);
	        System.out.println("person ID:"+id);
	        System.out.println("Account Balence:"+bal);
	    }
	}
