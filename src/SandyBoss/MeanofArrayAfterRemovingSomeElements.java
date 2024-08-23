package SandyBoss;

import java.util.Arrays;

public class MeanofArrayAfterRemovingSomeElements {
	
	public static void main(String [] args) {
		int arr [] = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,
				1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
		System.out.println(trimMean(arr));
	}
	public static double trimMean(int arr[]) {
		Arrays.sort(arr);
		int n = arr.length;
		int reduceFP = (n*5)/100;
		int sum = 0;
		int count = 0;
		for(int i=reduceFP; i<n-reduceFP; i++) {
			sum+=arr[i];
			count++;
		}
		double res = (double)sum/count;
		return res;
	}
}
