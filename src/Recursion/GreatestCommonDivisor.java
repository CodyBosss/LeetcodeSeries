package Recursion;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		System.out.println(gcd(x, y));
	}

	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}
		return gcd(y, x % y);
	}
}
