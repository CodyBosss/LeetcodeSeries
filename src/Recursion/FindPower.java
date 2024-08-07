package Recursion;

public class FindPower {
	public static void main(String[] args) {
		int p = 4, q = 4;
		System.out.println(pow(p, q));
	}

	public static int pow(int p, int q) {
		if (q == 0) {
			return 1;
		}
		return p * pow(p, q - 1);
	}
}
