package Recursion;

public class RemoveOccurences {
	public static void main(String[] args) {
		String str = "x";
		System.out.println(removeOcc(str, 0));
		System.out.println(remove2(str));
	}

	public static String removeOcc(String str, int idx) {
		if (idx == str.length()) {
			return "";
		}
		String smallAns = removeOcc(str, idx + 1);
		char curChar = str.charAt(idx);
		if (str.charAt(idx) != 'a') {
			return curChar + smallAns;
		} else {
			return smallAns;
		}
	}
	
	//By using substring method.
	public static String remove2(String str) {
		if (str.length() == 0) {
			return "";
		}
		String smallAns = remove2(str.substring(1));
		char curChar = str.charAt(0);
		if (curChar != 'a') {
			return curChar + smallAns;
		} else {
			return smallAns;
		}
	}
}
