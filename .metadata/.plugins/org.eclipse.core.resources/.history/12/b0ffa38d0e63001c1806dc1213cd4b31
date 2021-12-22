class PolytwoA{ 
	
	public void fun1(int x){
		System.out.println("int in Class A is : " + x);
    }
}

class PolytwoB extends PolytwoA{
	public void fun1(int x){
		System.out.println("int in Class B is : " + x);
    }
}

public class Polytwo{
	public static void main(String[ ] args){
		PolytwoA obj;
        obj=new PolytwoA(); // line 1
        obj.fun1(2);  // line 2 (prints "int in Class A is : 2")
        obj=new PolytwoB();  // line 3
        obj.fun1(5);  // line 4 (prints "int in Class B is : 5")
    }
}