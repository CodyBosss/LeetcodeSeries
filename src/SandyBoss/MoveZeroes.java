package SandyBoss;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
		int nums[] = { 0, 1, 0, 3, 12 }; //1 3 12 0 0

		moveZeroes(nums);
	}

	public static void moveZeroes(int nums[]) {
		
		int nonZeroes = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=0) {
				nums[nonZeroes] = nums[i];
				nonZeroes++;
			}
		}
		for(int i=nonZeroes; i<nums.length; i++) {
			nums[i]=0;
		}
		System.out.println(Arrays.toString(nums));
	}
}
