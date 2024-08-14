package SandyBoss;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
	public static void main(String [] args) {
		String s = "leetcode";
		List<String> wordDist = List.of("leet","code");
		System.out.println(wordBreak(s, wordDist));
	}	
	public static boolean wordBreak(String s, List<String> wordDist) {
		Set<String> wordSet = new HashSet<>(wordDist);
		boolean [] dp = new boolean[s.length()+1];
		dp[0] = true;
		for(int i=1; i<=s.length(); i++) {
			for(int j=0; j<i; j++) {
				if(dp[j] && wordSet.contains(s.substring(j,i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[s.length()];
	}
}
