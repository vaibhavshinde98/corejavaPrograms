package Java.basic.programs;

public class FactorialNumber {

	public static void main(String[] args) {
		int no=5;
		int fact=1;
		
		for(int i=5;i>0;i--) {
			fact= fact*i;
		}
		System.out.println(fact);

	}

}
