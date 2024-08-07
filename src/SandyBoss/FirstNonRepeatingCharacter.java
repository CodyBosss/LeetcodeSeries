package SandyBoss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	public static void main(String [] args) {
		String s = "leetcode";
		System.out.println(firstUniqChar(s));
	}
	public static int firstUniqChar(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		for(int i=0; i<s.length(); i++) {
			if(map.get(s.charAt(i))==1) {
				return i;
			}
		}
		return -1;
	}
}
