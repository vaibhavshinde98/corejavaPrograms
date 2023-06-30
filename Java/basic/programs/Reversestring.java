package Java.basic.programs;

public class Reversestring {

	public static void main(String[] args) {
		String str="welcome";
		int len= str.length();
		
		for(int i=len-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
