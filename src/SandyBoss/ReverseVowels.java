package SandyBoss;

import java.util.Arrays;

public class ReverseVowels {
	public static void main(String [] args) {
		String s = "Hello";
		System.out.println(reverseVowels(s));
	}
	public static String reverseVowels(String s) {
		char res [] = s.toCharArray();
		int l = 0;
		int r = s.length()-1;
		String vowels = "aeiouAEIOU";
		while(l<r && vowels.indexOf(res[l])==-1) {
			l++;
		}
		while(l<r && vowels.indexOf(res[r])==-1) {
			r--;
		}
		char temp = res[l];
		res[l] = res[r];
		res[r] = temp;
		l++;
		r--;
		String result = new String(res);
		return result;
	}
}
