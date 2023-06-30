package Java.basic.programs;

public class ArrayProgram {

	public static void main(String[] args) {
		int [] n= {11,34,45,22,34,56,22,34,98};
		int count=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]%2!=0) {
				count++;
			}
		}
		System.out.println("count of odd digits is : "+ count);

	}

}
