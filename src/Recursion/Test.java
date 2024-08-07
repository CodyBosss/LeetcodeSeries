package Recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(reletiveRank(a)));
	}

	static String[] reletiveRank(int[] a) {
		 String[] ans = new String[a.length];
	        int[] temp = Arrays.copyOf(a, a.length);
	        Arrays.sort(temp);
	        Map<Integer, String> mp = new HashMap<>();
	        for (int i = 0; i < temp.length; i++) {
	            if (i == temp.length - 1) 
	            	mp.put(temp[i], "Gold Medal");
	            else if (i == temp.length - 2) 
	            	mp.put(temp[i], "Silver Medal");
	            else if (i == temp.length - 3) 
	            	mp.put(temp[i], "Bronze Medal");
	            else {
	                mp.put(temp[i], Integer.toString(temp.length - i));
	            }
	        }
	        for (int i = 0; i < a.length; i++) {
	            ans[i] = mp.get(a[i]);
	        }
	        return ans;
	}
}
