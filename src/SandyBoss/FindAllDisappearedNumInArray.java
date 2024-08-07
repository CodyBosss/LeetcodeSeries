package SandyBoss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDisappearedNumInArray {
	
	public static void main(String [] args) {
		int [] nums = {4,3,2,7,8,2,3,1};	
		System.out.println(findMissingNum(nums));
	}
	public static List<Integer> findMissingNum(int [] nums){
		Set<Integer> set = new HashSet<>();
		for(int res : nums) {
			set.add(res);
		}
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<nums.length; i++) {
			if(!set.contains(i)) {
				list.add(i);
			}
		}
		return list;
	}
}
