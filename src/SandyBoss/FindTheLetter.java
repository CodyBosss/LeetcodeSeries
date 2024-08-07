package SandyBoss;

import java.util.HashMap;
import java.util.Map;

public class FindTheLetter {
	public static void main(String [] args) {
		String s = "aaf";
		String t = "aa";
		System.out.println(findDifference(s, t));
	}
	public static char findDifference(String s, String t) {
		/*
		 * Map<Character, Integer> map = new HashMap<>(); char res=0; for(char c :
		 * s.toCharArray()) { map.put(c, map.getOrDefault(c, 0)+1); } for(char c :
		 * t.toCharArray()) { if(!map.containsKey(c) && map.get(c)==1) { res = c; } }
		 * return res;
		 */
		char c=0;
		for(char cs : s.toCharArray()) {
			c^=cs;
		}
		for(char ct : t.toCharArray()) {
			c^=ct;
		}
		return c;
	}
}
