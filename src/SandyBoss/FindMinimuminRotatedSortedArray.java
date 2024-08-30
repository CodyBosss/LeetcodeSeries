package SandyBoss;

public class FindMinimuminRotatedSortedArray {
	public static void main(String [] args) {
		int nums [] = {5,1,2,3,4};		// 4,5,6,7,0,1,2		// 11,13,15,17
		System.out.println(findMin(nums));
	}
	public static int findMin(int nums[]) {
		int l=0, r=nums.length-1;
		int mid = 0;
		while(l<r) {
			mid = l+(r-l)/2;
			if(nums[mid]>nums[r]) {
				l = mid+1;
			}
			else {
				r = mid;
			}
		}
		return nums[l];
	}
}
