package corejavapractice;

public class Switch {

	public static void main(String[] args) {
		int n=2;
		switch(n%2) {
		case 0:{
			System.out.println("even");
			break;
		}
		case 1:{
			System.out.println("odd");
		}
		}
	}

}
