package Java.basic.programs;

//A neon number is a number where the sum of digits of the square of the number is equal to the number
public class NeonNumber {

	public static void main(String[] args) {
		int num=9;
		int sum=0;
		int sq=num*num;
		while(sq!=0) {
			sum=sum+sq%10;
			sq/=10;
		}
		if(sum==num) {
			System.out.println("this is neon");
		}
		else {
			System.out.println("not neon");
		}
	}
	

}
