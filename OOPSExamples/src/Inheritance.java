
class A {
	public void fun1(int x) {
		System.out.println("Int in A is :" + x);
	}
}

class B extends A {
	public void fun2(int x, int y) {
		fun1(6);
		System.out.println("Int in B is :" + x + " and " + y);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		B obj = new B();
		obj.fun2(2, 5);
	}

}
