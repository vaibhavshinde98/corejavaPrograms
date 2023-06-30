package Java.basic.programs;

public class PerfectSquare {

	public static void main(String[] args) {
		int num=25;
		int flag=1;
		for(int i=1;i<=num;i++) {
			if(i*i==num) {
				flag=2;
				System.out.println("thias is a perfect square");
				break;
				
			}
		}
		if(flag==1) {
			System.out.println("this is not perfect square");
		}
	
	}

}
