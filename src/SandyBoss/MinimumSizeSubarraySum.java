package SandyBoss;

public class MinimumSizeSubarraySum {
	public static void main(String [] args) {
		int nums[] = { 2, 3, 1, 2, 4, 3 };
		int target = 7;
		System.out.println(minSubArrayLen(nums, target));
	}
	public static int minSubArrayLen(int nums[], int target) {
		int l=0, sum=0;
		int minLength = Integer.MAX_VALUE;
		for(int r=0; r<nums.length; r++) {
			sum += nums[r];
			while(sum>=target) {
				minLength = Math.min(minLength, r-l+1);
				sum -= nums[l];
				l++;
			}
		}
		return minLength == Integer.MAX_VALUE ? 0:minLength;
	}
}
