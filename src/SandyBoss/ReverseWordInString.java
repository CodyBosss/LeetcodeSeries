package SandyBoss;

import java.util.Arrays;

public class ReverseWordInString {
	public static void main(String [] args) {
		String s = "  hello world  ";
		System.out.println(reverseString(s));
	}
	public static String reverseString(String s) {
		String[] str = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            res.append(str[i]);
            if (i != 0) {
                res.append(" ");
            }
        }
        return res.toString(); 
	}
}
