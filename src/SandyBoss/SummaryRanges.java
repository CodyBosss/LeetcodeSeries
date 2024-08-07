package SandyBoss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {
	public static void main(String [] args) {
		int [] nums = {0,1,2,4,5,7};
		System.out.println(summaryRanges(nums));
	}
	public static List<String> summaryRanges(int nums[]){
		List<String> list = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			int left=i,right=i;
			while(right+1<nums.length && nums[right+1]==nums[right]+1)
				right++;
			if(left != right)
				list.add((nums[left])+"->"+(nums[right]));
			else
				list.add(String.valueOf(nums[left]));
			i=right;
		}
		return list;
	}
}
