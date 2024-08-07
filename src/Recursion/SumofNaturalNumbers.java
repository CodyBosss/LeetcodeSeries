package Recursion;

public class SumofNaturalNumbers {
	public static void main(String [] args) {
		int n = 5;
		System.out.println(sum(n));
	}
	public static int sum(int n) {
		if(n==0)return n;
		return sum(n-1)+n;
	}
}
