package Java.basic.programs;

public class FindLargestNo {

	public static void main(String[] args) {
		int [] nums= {22,33,44,55,66,33,12,27};
		int larg= nums[0];
		for(int i=0; i<nums.length;i++) {
			if(nums[i]>larg) {
				larg=nums[i];
			}
		}
		System.out.println(larg);

	}

}
