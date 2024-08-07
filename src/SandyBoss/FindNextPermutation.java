package SandyBoss;

import java.util.Arrays;

public class FindNextPermutation {

	public static void main(String[] args) {
        int[] nums = {3,2,1};
        generatePermutations(nums);
    }

    public static void generatePermutations(int[] nums) {
        if(nums.length==0 || nums==null) {
        	return;
        }
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]) {
        	i--;
        }
        if(i>=0) {
        	int j=n-1;
        	while(j>=0 && nums[j]<=nums[i]) {
        		j--;
        	}
        	swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void swap(int [] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
    public static void reverse(int nums[], int start, int end) {
    	while(start<end) {
    		swap(nums, start, end);
    		start++;
    		end--;
    	}
    }
}
