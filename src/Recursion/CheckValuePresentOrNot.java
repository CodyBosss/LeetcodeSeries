package Recursion;

public class CheckValuePresentOrNot {
	public static void main(String[] args) {
		int arr[] = { 32 };
		int target = 4;
		if (find(arr, arr.length, target, 0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean find(int arr[], int n, int target, int idx) {
		// base case
		if (idx >= n) {
			return false;
		}
		if (arr[idx] == target) {
			return true;
		}
		return find(arr, n, target, idx + 1);
	}
}
