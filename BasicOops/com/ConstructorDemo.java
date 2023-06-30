package BasicOops.com;

public class ConstructorDemo {

	int x,y;
	String s;
	
	
//	ConstructorDemo(){
//		x=23;
//		y=34;
//		s="hii";
//	}
	
	
	// parameterised constructor
	
	ConstructorDemo(int a, int b, String z){
		x=a;
		y=b;
		s=z;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		ConstructorDemo cd= new ConstructorDemo(10,20,"ganesh");
		cd.display();

	}

}
