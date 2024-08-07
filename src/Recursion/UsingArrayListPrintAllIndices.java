package Recursion;

import java.util.ArrayList;

public class UsingArrayListPrintAllIndices {
	public static ArrayList<Integer> search(int a[], int n, int t, int idx){
		ArrayList<Integer> list = new ArrayList<>();
		if(idx>=n) {
			return list;
		}
		if(a[idx]==t) {
			list.add(idx);
		}
		ArrayList<Integer> al = search(a,n,t,idx+1);
		list.addAll(al);
		return list;
	}

	public static void main(String[] args) {
		int a[] = { 4, 2, 5, 6, 2, 7, 1, 2, 9 };
		int t = 2;
//		System.out.println(search(a, a.length, t, 0));
		ArrayList<Integer> check = search(a,a.length,t,0);
		for(Integer res : check) {
			System.out.print(res+" ");
		}
	}
}
