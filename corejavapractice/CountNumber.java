package corejavapractice;

public class CountNumber {

	public static void main(String[] args) {
		int count=0;
		for(int i=0;i<=100;i++) {
			if(i%4==0 && i%9==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
