package SandyBoss;

public class FindIfDigitGameCanBeWon {
	public static void main(String [] args) {
		int nums [] = {1,2,3,4,5,14};
		System.out.println(canAliceWin(nums));
	}
	public static boolean canAliceWin(int nums[]) {
		int sum1=0, sum2=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<=9) {
				sum1 += Math.min(sum1, nums[i]);
			}
			else if(nums[i]>=10) {
				sum2 += Math.max(sum2, nums[i]);
			}
		}
		int min = Math.min(sum1, sum2);
		int max = Math.max(sum1, sum2);
		if(min<max) 
			return true;
		
		return false;
	}
}
