package BasicOops.com;

public class Greeting {
	void greet() {
		System.out.println("Hi");
	}
	
	//no parameter and return value
	String greet1() {
		return"how are you!";
	}
	
	// take parameter no return value 
	void greet2(String name) {
		System.out.println("my name is: "+ name);
	}
	
	//parameter with return value
	String greet3(String str){
		return ("pretty"+str);
	}
}
