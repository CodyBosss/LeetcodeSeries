package SandyBoss;

public class IsSubsequence {
	public static void main(String [] args) {
		String s = "axc";
		String t = "ahbgdc";
		System.out.println(IsSubsequence(s, t));
	}
	public static boolean IsSubsequence(String s, String t) {
		
		int i=0, j=0;
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
			}
			j++;
		}
		return i==s.length();
	}
}
