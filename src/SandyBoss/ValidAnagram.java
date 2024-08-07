package SandyBoss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	public static void main(String[] args) {
		String s = "nagramdf";
		String t = "nagramaz";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {
		int count[] = new int[26];
		for (char c : s.toCharArray()) {
			count[c - 'a']++;
		}
		for(char c : t.toCharArray()) {
			count[c-'a']--;
		}
		for(int i=0; i<26; i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		System.out.println(Arrays.toString(count));
		return true;
	}
}
