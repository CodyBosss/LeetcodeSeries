package SandyBoss;

import java.lang.Character.Subset;

public class SubsetUsingInteger {
	public static void main(String [] args) {
		int nums [] = {1,2,3};
		subSet(nums, 0, "");
	}
	public static void subSet(int nums[], int idx, String curSet) {
		if(idx==nums.length) {
			System.out.println("{"+curSet.trim()+"}");
			return;
		}
		subSet(nums, idx+1, curSet);
		subSet(nums, idx+1, curSet+nums[idx]+" ");
	}
}
