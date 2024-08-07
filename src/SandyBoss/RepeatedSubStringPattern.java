package SandyBoss;

public class RepeatedSubStringPattern {
	public static void main(String [] args) {
		String s = "abc";
		System.out.println(repeatedSubString(s));
	}
	public static boolean repeatedSubString(String s) {
		String add = s+s;
		String res = add.substring(1,add.length()-1);		
		return res.contains(s);
	}
}
