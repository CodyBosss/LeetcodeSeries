package SandyBoss;

public class MaximumSubArray {
	public static void main(String [] args) {
		int nums[] = {1,2,3,4,4,5};
		System.out.println(maxSum(nums));
	}
	public static int maxSum(int nums[]) {
		int maxSum = nums[0];
		int currentSum = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum+nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}
}
