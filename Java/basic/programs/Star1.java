package Java.basic.programs;

public class Star1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=n;j++) {
				if(i>=j) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}

	}

}
