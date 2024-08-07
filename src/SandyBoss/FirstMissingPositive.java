package SandyBoss;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {
	
	public static void main(String [] args) {
		int nums[]= {5,4,3,1,2,-1};
		System.out.println(firstMissingPositive(nums));
	}
	public static int firstMissingPositive(int nums[]) {
//		Map<Integer, Boolean> map = new HashMap<>();
//		for(int add:nums) {
//			map.put(add,true);
//		}
//		int num = 1;
//		while(true) {
//			if(!map.containsKey(num)) {
//				return num;
//			}
//			num++;
//		}
		
		
		for(int i=0; i<nums.length; i++) {
			while(nums[i]>0 && nums[i]<=nums.length && nums[nums[i]-1]!=nums[i]) {
				int temp = nums[i];
				nums[i] = nums[nums[i]-1];
				nums[temp-1] = temp;
			}
		}
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=i+1) {
				return i+1;
			}
		}
		return nums.length+1;
	}
}
