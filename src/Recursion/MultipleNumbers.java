package Recursion;

public class MultipleNumbers {
	public static void main(String [] args) {
		int n = 12, k=5;
		mulNum(n, k);
	}
	public static void mulNum(int n, int k) {
		if(k==0) {
			return;
		}
		mulNum(n,k-1);
		System.out.println(n*k);
	}

}
