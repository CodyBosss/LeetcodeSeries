package SandyBoss;

import java.util.Arrays;

public class MinimumMovestoEqualArrayElementsII {
	public static void main(String[] args) {
		int nums[] = { 1, 3, 5, 8, 10, 12 };
		System.out.println(minMoves(nums));
	}

	static int minMoves(int nums[]) {
		Arrays.sort(nums);
		int med = nums[nums.length / 2];
		int res = 0;

		for (int num : nums) {
			res += Math.abs(num - med);
		}
		return res;
	}
}
