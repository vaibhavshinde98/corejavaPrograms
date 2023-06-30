package BasicOops.com;

public class GreetingMain {

	public static void main(String[] args) {
		Greeting gt= new Greeting();
		gt.greet();
		String str=gt.greet1();
		System.out.println(gt.greet1());
//		System.out.println(str);
		
		gt.greet2("vaibhav");
		
		System.out.println(gt.greet3(" good"));
//		gt.greet3("good");
	}

}
