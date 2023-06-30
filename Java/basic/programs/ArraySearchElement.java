package Java.basic.programs;

public class ArraySearchElement {

	public static void main(String[] args) {
		int []a= {2,3,5,43,23,13,90,56};
		int find=10;
		int flag=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==find) {
				flag=2;
				break;
				
			}
			
		}
		if(flag==2) {
			System.out.println("element is present in array");
		}
		else {
			System.out.println(" element is not found");
		}
		

	}

}
