package SandyBoss;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String [] args) {
		int nums1 [] = {1,2,3,0,0,0};
		int nums2 [] = {2,5,6};
		int n = nums1.length-3;
		int m = nums2.length;
		mergeArray(nums1, nums2, n, m);
	}
	public static void mergeArray(int nums1[], int nums2[], int n, int m) {
		int i=n-1, j=m-1, k=m+n-1;
	
		while(i>=0 && j>=0) {
			if(nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			}
			else {
				nums1[k--] = nums2[j--];
			}			
		}
		while(j>=0) {
			nums1[k--]=nums2[j--];
		}
		System.out.println(Arrays.toString(nums1));
	}
}
