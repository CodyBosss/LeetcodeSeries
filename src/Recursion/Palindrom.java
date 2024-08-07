package Recursion;

public class Palindrom {
	public static void main(String[] args) {
		String s = "mada";
//		String rev = isPalindrom(s, 0);		
//		if (s.equals(rev)) {
//			System.out.printf("%s is Palindrom", s);
//		} else {
//			System.out.printf("%s is not Palindrom", s);
//		}
		System.out.println(isPalindrom1(s, 0, s.length()-1));
	}

//	public static String isPalindrom(String s, int idx) {
//		if (idx == s.length())return "";
//		String smallAns = isPalindrom(s, idx + 1);
//		return smallAns + s.charAt(idx);
//	}
	
	// By using pointers
	
	public static boolean isPalindrom1(String s, int l, int r) {
		if(l>=r)return true;
		return (s.charAt(l)==s.charAt(r)&& isPalindrom1(s, l+1, r-1));
	}
}
