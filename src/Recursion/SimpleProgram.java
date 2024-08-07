package Recursion;

public class SimpleProgram {

	public static void main(String [] args) {
		int n = 5;
		printNum(n);		
	}
	public static void printNum(int n) {
		// base condition
		if(n==1) {
			System.out.println(1);
			return;
		}
		printNum(n-1);
		System.out.println(n);
		
	}
}
