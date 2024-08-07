package Recursion;

public class ArmstrongNumber {
	public static int arm(int num, int n) {
		if (num == 0) {
			return 0;
		}
		return arm(num / 10, n) + (int) Math.pow(num % 10, n);
	}

	public static void main(String[] args) {
		int num = 152, n = 3;
		System.out.println(arm(num, n));
	}
}
