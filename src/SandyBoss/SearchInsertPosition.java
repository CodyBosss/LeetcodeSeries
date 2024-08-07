package SandyBoss;

import java.util.HashMap;
import java.util.Map;

/*Given a sorted array of distinct integers and a target value, 
 * return the index if the target is found. If not, return the index where it would be 
 * if it were inserted in order. 
You must write an algorithm with O(log n) runtime complexity.*/

public class SearchInsertPosition {

	public static void main(String [] args) {
		int [] a = {1,3,5,6};
		int n = a.length;
		int target = 4;
		System.out.println(searchInsertPosition(a, n, target));
	}
	
	public static int searchInsertPosition(int [] a, int n, int target) {	
		int i=0;
		for(i=0; i<n; i++) {
			if(a[i]==target) {
				return i;				
			}
			else if(a[i]>target) {
				return i;
			}
		}
		return i;
	}
}
