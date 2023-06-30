package BasicOops.com;

class A{
	static int a=10;
	int a1=20;
	A(){
		super();
		System.out.println("A()");
	}
}

class B extends A{
	static int b=30;
	int b1=40;
	
	B(){
		super();
		System.out.println("B()");
	}
}

class C extends B{
	static int c=50;
	int c1=60;
	
	C(){
		super();
		System.out.println("c()");
	}
}
public class ConstructionChaining {

	public static void main(String[] args) {
		
		C obj= new C();
	}

}
