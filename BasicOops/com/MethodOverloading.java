package BasicOops.com;

public class MethodOverloading {
	
	void add(int a, int b) {
		int z= a+b;
		System.out.println(z);
	}
	
	void add(int a, double b ) {
		double z=a+b;
		System.out.println(z);
	}

	public static void main(String[] args) {
		MethodOverloading mo= new MethodOverloading();
		mo.add(99,99.23);
	}

}
