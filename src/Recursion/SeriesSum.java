package Recursion;

public class SeriesSum {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(seriesSum(n));
	}

	public static int seriesSum(int n) {
		if (n == 0)
			return n;
		if (n % 2 == 0)
			return seriesSum(n - 1) - n;
		return seriesSum(n - 1) + n;
	}
}
