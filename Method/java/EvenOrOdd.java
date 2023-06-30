package Method.java;

public class EvenOrOdd {

	public static boolean evenodd(int num) {
		return num/2==0;
	}
	public static void main(String[] args) {
	int num=68;
	if(evenodd(num)) {
		System.out.println(num+"is even");
	}
	else {
		System.out.println(num+" is odd");
	}

	}

}
