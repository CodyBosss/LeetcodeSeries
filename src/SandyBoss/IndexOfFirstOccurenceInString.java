package SandyBoss;

public class IndexOfFirstOccurenceInString {
	
	public static void main(String [] args) {
		String haystack = "sadbutsad";
		String needle = "sads";
		System.out.println(firstOccurence(haystack, needle));

	}
	public static int firstOccurence(String haystack, String needle) {
		for(int i=0; i<haystack.length()-needle.length(); i++) {
			if(haystack.charAt(i)==needle.charAt(0)) {
				if(haystack.subSequence(i, needle.length()).equals(needle)) {
					return i;
				}
			}
		}
		
		return -1;
	}
}
