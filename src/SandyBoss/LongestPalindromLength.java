package SandyBoss;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromLength {
	public static void main(String[] args) {
		String str = "abccccddd"
				+ "";
		longestPalindrom(str);
	}

	public static void longestPalindrom(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		int length = 0;
		boolean hasOdd = false;
		for(int count : map.values()) {
			length += (count/2)*2;
			if(count%2==1) {
				hasOdd = true;
			}
		}
		if(hasOdd) {
			length+=1;
		}
		System.out.println(length);
	}
}
