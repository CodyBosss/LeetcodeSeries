package Recursion;

public class SumofAllSubsets {
	public static void main(String[] args) {
		int a[] = { 2, 4, 5 };
		printSum(a, a.length, 0, 0);
	}

	public static void printSum(int a[], int n, int idx, int sum) {
		if (idx >= n) {
			System.out.println(sum);
			return;
		}
		printSum(a, n, idx + 1, sum + a[idx]); // include
		printSum(a, n, idx + 1, sum); // exclude
	}
}
