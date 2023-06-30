package Inheritance.com;


class A {
	void display() {
		System.out.println("hi A");
	}
}

class B extends A{
	void display2() {
		System.out.println("Hi B");
	}
}


public class InheritanceType {
	public static void main(String[] args) {
		A obja= new A();
		obja.display();


	}

}
