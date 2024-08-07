package SandyBoss;

import java.util.TreeMap;

public class SearchInRotatedSortedArray {
	public static void main(String [] args) {
		int nums [] = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(search(nums, target));
	}
	public static int search(int nums [], int target) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], i);
		}
		if(map.containsKey(target)) {
			return map.get(target);
		}
		
		return -1;
	}
}
