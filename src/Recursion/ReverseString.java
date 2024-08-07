package Recursion;

public class ReverseString {
	public static void main(String [] args) {
		String s = "Sudhir";
		System.out.println(reverse(s,0));
		System.out.println(reverse2(s));
	}
	public static String reverse(String s, int idx) {
		if(idx==s.length()) return "";
		String smallAns = reverse(s, idx+1);
		return smallAns+s.charAt(idx);
	}
	
	public static String reverse2(String s) {
		if(s.length()==0)return "";
		String smallAns = reverse2(s.substring(1));
		return smallAns+s.charAt(0);
	}
}
