package corejavapractice;

public class MultiArray {

	public static void main(String[] args) {
		
//		we can create array by 3 types
		//approach-1 -
		
		int n[][]=new int[3][2];   
//		int []n[]=new int [3][2];
//		int [][]n= new int [3][2];
		
		 n[0][0]= 10;
		 n[0][1]=20;
		 n[1][0]=30;
		 n[1][1]=40;
		 n[2][0]=50;
		 n[2][1]=60;
		 
//		 approach 2
		 //length of array
//		 
//		 int b[][]= {
//				 	{10,20},
//				 	{30,40},
//				 	{50,60}
//		 			};
		 
		 
		 
//		 System.out.println(n.length);
//		 System.out.println( n[2][1]);
		 
		 
//		 read all the value from array
		 
		/* for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j]);
			}
			System.out.println();
		}*/
		 
		 // user enhance for loop
		 for (int x[]:n) {
			for (int v:x) {
				System.out.print(v);
				
			}
			System.out.println();
		}

	}

}
