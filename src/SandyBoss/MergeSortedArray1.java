package SandyBoss;

import java.util.Arrays;

public class MergeSortedArray1 {
	
	public static void main(String [] args) {
		int a [] = {1,2,3};
		int b [] = {4,5,6};
		sortedArray(a, b);
	}
	
	public static void sortedArray(int a [], int b []) {
		int res [] = new int[a.length+b.length];
		for(int i=0; i<a.length; i++) {
			res[i] = a[i];
		}
		for(int i=0; i<b.length; i++) {
			res[a.length+i] = b[i];
		}
		System.out.println(Arrays.toString(res));
	}
}
