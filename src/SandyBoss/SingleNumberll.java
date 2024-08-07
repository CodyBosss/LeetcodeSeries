package SandyBoss;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberll {

	public static void main(String[] args) {
		int nums[] = { 1,0,1,0,1,0,2,3,2,3,2,3,99 };
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int nums[]) {
		Map<Integer, Integer> map = new HashMap<>();
		int result = 0;
		for (int res : nums) {
			if(!map.containsKey(res)) {
				map.put(res, map.getOrDefault(res, 0)+1);
			}
			else {
				map.put(res, map.get(res)+1);
			}
		}
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(nums[i])) {
				if(map.get(nums[i])==1) {
					result= nums[i];
				}
			}
		}
		return result;
	}
}
