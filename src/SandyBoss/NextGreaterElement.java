package SandyBoss;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
	public static void main(String [] args) {
		int nums1 [] = {4,1,2};
		int nums2 [] = {1,3,4,2};
		System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
	}
	public static int[] nextGreaterElement(int nums1[], int nums2[]) {
		Map<Integer, Integer> map = new HashMap<>();
		Deque<Integer> stack = new ArrayDeque<>();
		for(int num : nums2) {
			while(!stack.isEmpty() && stack.peek()<num) {
				map.put(stack.pop(), num);
			}
			stack.push(num);
		}
		int result [] = new int[nums1.length];
		for(int i=0; i<nums1.length; i++) {
			result[i] = map.getOrDefault(nums1[i], -1);
		}
		return result;
	}	
}