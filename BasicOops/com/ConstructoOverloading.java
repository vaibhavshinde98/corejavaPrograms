package BasicOops.com;

public class ConstructoOverloading {
	
	
	ConstructoOverloading(int a, int b){
		System.out.println(a+b);
	}
	ConstructoOverloading(float a, int s){
		System.out.println(a+s);
	}
	public static void main(String[] args) {
		ConstructoOverloading co= new ConstructoOverloading(11,21);

	}

}
