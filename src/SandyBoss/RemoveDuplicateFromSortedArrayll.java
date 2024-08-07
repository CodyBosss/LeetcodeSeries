package SandyBoss;

public class RemoveDuplicateFromSortedArrayll {
	public static void main(String [] args) {
		int nums [] = {1,1,1,1,2,3,3,4};
		System.out.println(removeDuplicate(nums));
	}
	public static int removeDuplicate(int nums[]) {
		if(nums.length==2) {
			return nums.length;
		}
		int k=2;
		for(int i=2; i<nums.length; i++) {
			if(nums[i]!=nums[k-2]) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}
}
