package SandyBoss;

import java.util.Arrays;

public class LengthOfLastWord {
	public static void main(String [] args) {
		String str = "Hello Word";
		String [] res = str.split(" ");		
		for(int i=0; i<res.length; i++) {
			System.out.println(res[res.length-1].length());
			break;
		}
	}
	
}
