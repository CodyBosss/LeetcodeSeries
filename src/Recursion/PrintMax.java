package Recursion;

public class PrintMax {
	public static void main(String [] args) {
		int arr [] = {3,10,3,2,5};
		System.out.println(printMax(arr, 0));
	}
	public static int printMax(int arr[], int idx) {
		if(idx==arr.length-1) {
			return arr[idx];
		}
		int smallProb = printMax(arr, idx+1);
		return Math.max(smallProb, arr[idx]);
	}
}
