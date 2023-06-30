package Method.java;

public class EvenOdd2 {

	public static void main(String[] args) {
		for(int i=50;i<=100;i++) {
			if(iseven(i)) {
				System.out.print(i+",");
			}
		}
	}
	
	public static boolean iseven(int num) {
		return num%2==0;
	}

}
