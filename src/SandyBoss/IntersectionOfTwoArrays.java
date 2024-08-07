package SandyBoss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int nums1[] = { 1,2,2,1 };
		int nums2[] = { 2,2};
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}
	public static int[] intersection(int nums1[], int nums2[]) {
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for(int res : nums1) {
			list1.add(res);
		}
		for(int res : nums2) {
			if(list1.contains(res)) {
				list2.add(res);
			}
		}
		 int[] result = new int[list2.size()];
	        int i = 0;
	        for (int num : list2) {
	            result[i++] = num;
	        }
		return result;
	}
}
