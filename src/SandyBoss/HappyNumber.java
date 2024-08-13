package SandyBoss;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String [] args) {
		int n = 7;
		System.out.println(isHappy(n));
	}
	public static boolean isHappy(int n) {
		Set<Integer> seen = new HashSet<>();
		//this line will check n is not equals to 1 and it is not present in the set before;
		while(n!=1 && !seen.contains(n)) {
			seen.add(n);
			n = getNext(n);
		}
		return n==1;
	}
	private static int getNext(int n) {
		int sum = 0;
		while(n!=0) {
			int digit = n%10;
			sum = digit*digit;
			n = n/10;
		}
		return sum;
	}
}
