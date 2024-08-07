package SandyBoss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindAllDuplicateInArray {
	public static void main(String [] args) {
		int nums [] = {4,3,2,7,8,2,3,1};
		System.out.println(findDup(nums));
	}
	public static List<Integer> findDup(int nums[]){
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			int idx = Math.abs(nums[i])-1;
			System.out.print(idx+" ");
			if(nums[idx]<0) {
				list.add(Math.abs(nums[i]));
			}
			else {
				nums[idx] = -nums[idx];
			}
		}
		return list;
	}
}
