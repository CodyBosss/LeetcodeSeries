package SandyBoss;

import java.util.HashMap;
import java.util.Map;

public class MaximumProductOfWordLength {
	public static void main(String [] args) {
		String words [] = {"a","ab","abc","d","cd","bcd","abcd"};
		System.out.println(maxProduct(words));
	}
	public static int maxProduct(String words[]) {
		if(words==null || words.length == 0) {
			return 0;
		}
		int n = words.length;
		int masks [] = new int[n];
		int lengths [] = new int[n];
		
		for(int i=0; i<n; i++) {
			int mask = 0;
			for(char c : words[i].toCharArray()) {
				mask |= 1<<(c-'a');
			}
			masks[i] = mask;
			lengths[i] = words[i].length();
		}
		int maxProduct = 0;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if((masks[i] & masks[j])==0) {
					int product = lengths[i]*lengths[j];
					if(product>maxProduct) {
						maxProduct = product;
					}
				}
			}
		}
		return maxProduct;
	}
}
