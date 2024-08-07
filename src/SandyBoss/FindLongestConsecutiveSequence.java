package SandyBoss;

import java.util.HashSet;
import java.util.Set;

public class FindLongestConsecutiveSequence {
	public static void main(String[] args) {
		int nums[] = { 100, 200, 4, 1, 3, 2, 0, -1 };
		System.out.println(logestConsecutive(nums));
//		logestConsecutive(nums);
	}

	public static int logestConsecutive(int nums[]) {
		int count = 0;
		int result = 0;
		Set<Integer> hs = new HashSet<>();
		for (int num : nums) {
			hs.add(num);
		}
		for (int num1 : hs) {
			if (!hs.contains(num1 - 1)) {
				int currentNum = num1;
				count = 1;
				while (hs.contains(currentNum + 1)) {
					currentNum++;
					count++;					
				}
				result = Math.max(result, count);
			}
		}
		return result;
	}
}
