package Static.members;

public class StaticMethod {

	static void test() {
		System.out.println(" test method ");
	}
	public static void main(String[] args) {
		test();
		StaticMethod.test();

	}

}
