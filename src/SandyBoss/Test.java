package SandyBoss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int nums[] = { 1,1 };
		System.out.println(minSubsequence(nums));
		System.out.println("Check");
	}

	public static boolean minSubsequence(int[] nums) {
		Arrays.sort(nums); // 3 4 8 9 10
		int l = 0, r = nums.length - 1;
		int res1 = 0, res2 = 0;
		while (l < r - 1) {
			res1 += nums[l];
			l++;
			res2 = nums[r];
			if (res1 < res2) {
				return true;
			} else {
				r--;
				res1 -= nums[r];
				System.out.println(res1);
			}
		}
		return false;
	}
}
