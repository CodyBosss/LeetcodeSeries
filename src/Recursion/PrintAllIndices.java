package Recursion;

public class PrintAllIndices {
	public static void main(String [] args) {
		int a [] = {3,2,1,6,3,2,4,2};
		int t = 2;
		idxFind(a,a.length,t,0);
	}
	public static void idxFind(int a[], int n , int t, int idx) {
		if(idx>=n) {
			return;
		}
		if(a[idx]==t) {
			System.out.println(idx);
		}
		idxFind(a,n,t,idx+1);
	}
}
