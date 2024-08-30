package SandyBoss;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindMinimuminRotatedSortedArrayII {
	public static void main(String[] args) {
		int nums[] = { 2, 2, 2, 0, 1 };
		System.out.println(findMin2(nums));
	}
	public static int findMin1(int nums[]) {
		Arrays.sort(nums);
		return nums[0];
	}
	
	static int findMin2(int nums[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<nums.length; i++) {
			min = Math.min(min, nums[i]);
		}
		return min;
	}
}
