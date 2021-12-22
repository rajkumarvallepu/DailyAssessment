
public class Encapsulation {
	  private int amount=0;
      public int getAmount()
      {   
    	  return amount;
      }
      public void setAmount(int amt)
      {   
    	  amount=amt;
      }
public static void main(String[ ] args)
      {   
			int amt=0;
          Encapsulation obj=new Encapsulation();
          obj.setAmount(200);
          amt=obj.getAmount();
          System.out.println("Your current amount is :"+amt);
      }
}
