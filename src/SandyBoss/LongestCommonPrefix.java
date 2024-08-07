package SandyBoss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
	
	public static void main(String [] args) {
		String str [] = {"flower","flow","flight"};	
		System.out.println(longestPrefix(str));
	}
	public static String longestPrefix(String str[]) {
		if(str==null || str.length==0) {
			return "";
		}
//		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		String first = str[0];
		String last = str[str.length-1];
		int i=0;
		while(i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)) {
			i++;
		}
		return first.substring(0,i);
	}
}
