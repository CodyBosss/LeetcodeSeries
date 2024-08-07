package SandyBoss;

public class MakeAllMinimumOperationsDivisibleByThree {
	public static void main(String [] args) {
		int nums [] = {3,6,9};
		System.out.println(divisibleByThree(nums));
	}
	static int divisibleByThree(int nums []) {
		int count=0;
		for(int i=0; i<nums.length; i++) {			
			if(nums[i]%3==1) {
				if((nums[i]-1)%3==0)
					count++;
				
			}
			else if(nums[i]%3==2) {
				if((nums[i]+1)%3==0)
					count++;
				
			}
		}
		return count;
	}
}
