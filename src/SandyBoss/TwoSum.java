package SandyBoss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 15, 10 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum(arr, target)));
	}
	public static int[] twoSum(int [] arr, int target) {
		if(arr.length==0 || arr==null) {
			return arr;
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int res : arr) {
			map.put(res, map.getOrDefault(res, 0)+1);
		}
		for(int i=0; i<arr.length; i++) {
			int sum = target-arr[i];
			if(map.containsKey(sum) && map.get(sum)!=i) {
				return new int [] {i,map.get(sum)};
			}
		}
		return null;
	}
}
