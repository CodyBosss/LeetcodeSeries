package Recursion;

public class FibbonacciNumber {
	public static void main(String [] args) {
		for(int i=0; i<=10; i++) {
			System.out.println(fibbonacciNum(i));
		}		
	}
	public static int fibbonacciNum(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fibbonacciNum(n-1)+fibbonacciNum(n-2);
	}
}
