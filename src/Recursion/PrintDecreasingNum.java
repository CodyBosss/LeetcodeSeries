package Recursion;

public class PrintDecreasingNum {
	public static void main(String [] args) {
		int n = 5;
		printDecreasing(n);
	}
	public static void printDecreasing(int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}
		System.out.println(n);
		printDecreasing(n-1);
	}
}
