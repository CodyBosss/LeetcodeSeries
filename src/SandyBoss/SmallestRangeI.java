package SandyBoss;

public class SmallestRangeI {
	public static void main(String[] args) {
		int nums[] = { 2,7,2 };
		int k = 1;
		System.out.println(smallestRangeI(nums, k));
	}

	static int smallestRangeI(int nums[], int k) {
		if (nums.length == 1) {
			return 0;
		}
		int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for(int num : nums){
            if(num<minNum)
            minNum = num;

            if(num>maxNum)
            maxNum = num;
        }
        int newMin = minNum+k;
        int newMax = maxNum-k;

        return Math.max(0,newMax-newMin);
	}
}
