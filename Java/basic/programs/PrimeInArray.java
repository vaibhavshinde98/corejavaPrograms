package Java.basic.programs;

public class PrimeInArray {

	public static void main(String[] args) {
		int [] a= {12,3,5,9,72,34,58,35,89,76,56};
		
		for(int i=0;i<a.length;i++) {
			int flag=1;
			for(int j=2;j<a[i];j++) {
				if(a[i]%j==0) {
					flag=2;
					break;
				}
			}
			if(flag==1) {
				System.out.println(a[i]);
			}
		}
		

	}

}
