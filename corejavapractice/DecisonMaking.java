package corejavapractice;

public class DecisonMaking {

	public static void main(String[] args) {
		int n=27;
		if(n%3==0 && n%7==0){
			System.out.println("Hi ......");
		}
		else if(n%9==0) {
			System.out.println("how are you");
		}
		else if(n%2!=0) {
			System.out.println("Ok, Bye");
		}
	}

}
