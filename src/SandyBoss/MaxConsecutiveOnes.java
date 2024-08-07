package SandyBoss;

public class MaxConsecutiveOnes {	
	public static void main(String [] args) {
		int [] nums = {1,0,1,0,1};
		finMaxConsecutive(nums);
	}
	public static void finMaxConsecutive(int [] nums) {
		int res=0, j=0, k=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==1) {				
				j++;				
			}
			else {
				res = Math.max(j, res);
				j=0;
			}
		}
//		res = Math.max(j, res);
		System.out.println(res);
	}
}
