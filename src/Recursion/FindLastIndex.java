package Recursion;

public class FindLastIndex {
	
	public static void main(String [] args) {
		int a [] = {2,3,4,5,2,7,2,8,9};
		int t = 2;
		System.out.println(lastIndex(a,t,a.length-1));
	}
	public static int lastIndex(int a [], int t, int idx) {
		if(idx<0) {
			return -1;
		}
		if(a[idx]==t) {
			return idx;
		}
		return lastIndex(a,t,idx-1);
	}
}
