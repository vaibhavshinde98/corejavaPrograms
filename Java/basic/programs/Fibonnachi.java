package Java.basic.programs;

public class Fibonnachi {

	public static void main(String[] args) {
		int a=1,b=1;
		int k=0;
		System.out.println("1,1");
		while(k<=10) {
			k=a+b;
			System.out.print(k);
			a=b;
			b=k;
		}

	}

}
