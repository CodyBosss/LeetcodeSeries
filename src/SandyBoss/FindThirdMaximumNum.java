package SandyBoss;

import java.util.HashSet;
import java.util.Set;

public class FindThirdMaximumNum {
	
	public static void main(String [] args) {
		int [] arr = {5,2,2};
		int first,second,third;
		first=second=third=Integer.MIN_VALUE;
		System.out.println(thirdMax(arr,first,second,third));
	}
	
	public static int thirdMax(int arr [], int first, int second, int third) {
		
		long f,s,t;
		f=s=t=Long.MIN_VALUE;
		Set<Integer> hs = new HashSet<>();
		for(int res : arr) {
			if(!hs.contains(res)) {
				hs.add(res);
				if(f==0 || f<res) {
					t = s;
					s=f;
					f=res;
				}
				else if(s==0 || s<res) {
					t=s;
					s=res;
				}
				else if(t==0 || t<res) {
					t=res;
				}
			}
		}
		return t!=Long.MIN_VALUE ? (int)t : (int)f;
	}
}
