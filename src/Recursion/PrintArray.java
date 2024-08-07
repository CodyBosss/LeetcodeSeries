package Recursion;

public class PrintArray {
	public static void main(String [] args) {
		int arr [] = {3,4,5,6};
		printArray(arr, 0);
	}
	public static void printArray(int arr[], int idx) {
		if(idx==arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		printArray(arr,idx+1);
	}
}
