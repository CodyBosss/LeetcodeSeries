package Recursion;

public class SumOfArrayInteger {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		System.out.println(arrSum(arr, 0));
	}

	public static int arrSum(int arr[], int idx) {
		if (idx == arr.length) {
			return 0;
		}
		int sum = arrSum(arr, idx + 1);
		return sum + arr[idx];
	}
}
