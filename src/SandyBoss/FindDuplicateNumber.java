package SandyBoss;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumber {
	public static void main(String [] args) {
		int nums[] = {2}; 
		System.out.println(dupNumber(nums));
	}
	public static int dupNumber(int nums[]) {
		if(nums.length==0 || nums==null) {
			return 0;
		}
		int result = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int num : nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(nums[i])) {
				if(map.get(nums[i])>=2 || nums.length==1) {
					result = nums[i];
				}
			}
		}
		return result;
	}
}

/*
 * int slow =nums[0]; int fast = nums[0]; do { slow = nums[slow]; fast =
 * nums[nums[fast]]; }while(slow!=fast);
 * 
 * fast = nums[0];
 * 
 * while(slow!=fast) { slow = nums[slow]; fast = nums[fast]; }
 * 
 * return fast;
 */