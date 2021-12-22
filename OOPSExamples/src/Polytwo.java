class PolytwoA {

	public void fun1(int x) {
		System.out.println("int in Class A is : " + x);
	}
}

class PolytwoB extends PolytwoA {
	public void fun1(int x) {
		System.out.println("int in Class B is : " + x);
	}
}

public class Polytwo {
	public static void main(String[] args) {
		PolytwoA obj;
		obj = new PolytwoA();
		obj.fun1(2);
		obj = new PolytwoB();
		obj.fun1(5);
	}
}