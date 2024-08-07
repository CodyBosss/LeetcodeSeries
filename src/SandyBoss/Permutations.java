package SandyBoss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
	
	public static void main(String [] args) {
		int nums [] = {1,2,3};
		System.out.println(permute(nums));
	}
	public static List<List<Integer>> permute(int nums []){
		List<List<Integer>> result = new ArrayList<>();
		permuteHelper(nums,0,result);
		return result;
	}
	public static void permuteHelper(int [] nums, int start, List<List<Integer>> result) {
		List<Integer> curPermutation = new ArrayList<>();
		if(start==nums.length) {
			for(int num : nums) {
				curPermutation.add(num);
			}
			result.add(curPermutation);
		}
		else {
			Set<Integer> duplicate = new HashSet<>();
			for(int i=start; i<nums.length; i++) {
				if(duplicate.add(nums[i])) { 
				swap(nums,start, i);
				permuteHelper(nums,start+1,result);
				swap(nums,start,i);
				}
			}
		}
	}
	public static void swap(int [] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
