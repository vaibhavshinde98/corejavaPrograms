package Java.basic.programs;

public class PrintFactors {

	public static void main(String[] args) {
		int num=12;
		try {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					System.out.println(i);
				}
			}
		}catch(ArithmeticException e){
			System.out.println(" this is not divisioble by zero");
		}
		
	}

}
