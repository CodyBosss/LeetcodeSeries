package SandyBoss;

public class StringPalindromOrNot {
	public static void main(String [] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrom(s));
	}
	public static boolean isPalindrom(String s) {
		String res = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		int l = 0, r = res.length()-1;
		while(l<r) {
			if(res.charAt(l)!=res.charAt(r)) {
				return false;
			}
			l++;r--;
		}
		return true;
	}
}
