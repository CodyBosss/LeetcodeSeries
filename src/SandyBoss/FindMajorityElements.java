package SandyBoss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMajorityElements {
	
	public static void main(String [] args) {
		int [] a = {2,2,1,1,1,2,2,3};
		Arrays.sort(a); // 1,1,1,2,2,2,2,3
		System.out.println(majorityElement(a));
	}
	public static int majorityElement(int []a) {
		int res = 0;
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			if(count==0) {
				res=a[i];
				count++;
			}
			else if(a[i]==res) {
				count++;
			}
			else {
				count--;
			}
		}
		return res;
	}

}
