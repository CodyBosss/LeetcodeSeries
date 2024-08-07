package SandyBoss;

import java.util.Arrays;

public class MissingNumbers {
	public static void main(String[] args) {
		int nums [] = {3,0,1};
		System.out.println(misNum(nums));
	}

	public static int misNum(int nums[]) {
		int n = nums.length; // Length of the array
        // Initialize an array to mark visited numbers
        boolean[] visited = new boolean[n + 1];
        // Mark visited numbers
        for (int num : nums) {
            visited[num] = true;
        }
        // Find the missing number
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                return i;
            }
        }
        // If no missing number found, return -1 (this shouldn't happen in this case)
        return -1;
	}
}
