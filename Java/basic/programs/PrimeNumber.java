package Java.basic.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=71;
		int flag=2;
		
		for (int i = 2; i <num; i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==2) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("Not prime");
		}

	}

}
