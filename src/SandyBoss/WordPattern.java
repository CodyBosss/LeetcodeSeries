package SandyBoss;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public static void main(String [] args) {
		String pattern = "aaaa";
		String s = "dog dog dog dog";
		System.out.println(wordPattern(pattern, s));
	}
	public static boolean wordPattern(String pattern, String s) {
		String word [] = s.split(" ");
		if(word.length!=pattern.length()) {
			return false;
		}
		Map<Character, Integer> map = new HashMap<>();
		Map<String, Integer> map1 = new HashMap<>();
		for(int i=0; i<pattern.length(); i++) {
			if(map.put(pattern.charAt(i), i)!=map1.put(word[i], i)) {
				return false;
			}
		}
		return true;
	}
}
