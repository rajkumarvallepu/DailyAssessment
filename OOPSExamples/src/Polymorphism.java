class PolyA {

	public void fun1(int x) {
		System.out.println("The value of class A is : " + x);
	}

	public void fun1(int x, int y) {
		System.out.println("The value of class B is : " + x + " and " + y);
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		PolyA obj = new PolyA();

		obj.fun1(2);

		obj.fun1(2, 3);
	}
}
