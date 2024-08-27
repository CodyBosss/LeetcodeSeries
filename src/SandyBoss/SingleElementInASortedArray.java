package SandyBoss;

public class SingleElementInASortedArray {
	public static void main(String [] args) {
		int nums [] = {1,1,2,2,3,3,4,5,5};
		System.out.println(singleElement(nums));
	}
	static int singleElement(int nums []) {
//		Approach 1:
		
		int unique = 0;
		for(int i=0; i<nums.length; i++) {
			unique ^= nums[i];
		}
		return unique;
	}
}
