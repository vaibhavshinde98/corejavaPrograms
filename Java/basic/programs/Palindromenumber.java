package Java.basic.programs;

public class Palindromenumber {

	public static void main(String[] args) {
		int no=131;
		int reverseno=0;
		int reminder;
		int original=no;
		
		while(no!=0) {
			reminder= no%10;
			reverseno=reverseno*10+reminder;
			no=no/10;
		}
		System.out.println(reverseno);

	}

}
