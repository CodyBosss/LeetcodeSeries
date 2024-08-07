package SandyBoss;

public class LongestCommonSubSequence {
	public static void main(String [] args) {
		String str [] = {"aaa","acb"};
		System.out.println(findLength(str));
	}
	public static int findLength(String str []) {
		int l=0, r=l+1;
		int n = 0;
		while(r<str.length) {
			if(str[l].length()==str[r].length()) {
				r++;
				n=str.length;
			}
			else {
				return -1;
			}
		}
		return n;
	}
}
