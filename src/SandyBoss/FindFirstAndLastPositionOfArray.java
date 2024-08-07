package SandyBoss;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class FindFirstAndLastPositionOfArray {
	public static void main(String[] args) {
		int nums[] = { 5, 7, 7, 8, 10 };
		int target = 8;
		System.out.println(Arrays.toString(findFirstAndLastPosition(nums, target)));
	}

	public static int[] findFirstAndLastPosition(int nums[], int target) {
		
		int firstP = firstPosition(nums,target);
		int lastP = lastPosition(nums, target);
		return new int[] {firstP, lastP};
	}
	
	public static int firstPosition(int nums[], int target) {
		int l = 0, r = nums.length - 1;		
		int fp = -1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] >= target) {
				r = mid - 1;
				if (nums[mid] == target) {
					fp = mid;
				}
			} else {
				l = mid + 1;
			}
		}
		return fp;
	}

	public static int lastPosition(int nums[], int target) {
		int lp = -1;
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] <= target) {
				l = mid + 1;
				if (nums[mid] == target) {
					lp = mid;
				}
			} else {
				r = mid - 1;
			}
		}
		return lp;
	}
}
