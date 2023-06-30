package Static.members;

public class StaticIMP {
	static void m1() {       //static method
		System.out.println(" static method m1");
	}
	
	static int a= 111;    // static variable
	
	
	
	void m2() {			// non static method
		System.out.println("non static method m2");
	}
	
	void m3() {			// non static method
		System.out.println("Non static method m3");
	}
	
	
	static {			// static block
		System.out.println("this is static block");
	}
	
	
	// non static block
	{
		System.out.println("this is non static block");
	}
	public static void main(String[] args) {
		
		System.out.println(a);
		m1();
		
		//we can access non static stuff though object creation
		StaticIMP st=new StaticIMP();
		st.m2();
		
	}

}
