package Recursion;

public class IsSorted {
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 3 };
		if (isSorted(a, a.length, 0)) {
			System.out.println("Is Sorted");
		} else {
			System.out.println("Not Sorted");
		}
	}

	public static boolean isSorted(int a[], int n, int idx) {
		if (idx >= n - 1)
			return true;
		
		if (a[idx] > a[idx + 1]) {
			return false;
		}
		return isSorted(a, n, idx + 1);
	}
}
