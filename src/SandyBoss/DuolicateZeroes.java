package SandyBoss;

import java.util.Arrays;

public class DuolicateZeroes {
	public static void main(String [] args) {
		int nums [] = {0,0,0,0,0,0,0,0};
		dupZ(nums);
	}
	public static void dupZ(int [] nums) {
		int possibleDups = 0;
		int length = nums.length-1;
		for(int left = 0; left<=length-possibleDups; left++) {
			if(nums[left]==0) {
				if(left==length-possibleDups) {
					nums[length]=0;
					length-=1;
					break;
				}
				possibleDups++;
			}
		}
		int last = length-possibleDups;
		for(int i=last; i>=0; i--) {
			if(nums[i]==0) {
				nums[i+possibleDups]=0;
				possibleDups--;
				nums[i+possibleDups]=0;
			}
			else {
				nums[i+possibleDups]=nums[i];
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
