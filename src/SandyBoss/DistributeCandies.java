package SandyBoss;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
	public static void main(String[] args) {
		int[] candyType = { 6,6,6,6 };
		System.out.println(distributeCandies(candyType));
	}

	public static int distributeCandies(int[] candyType) {
		Set<Integer> unique = new HashSet<>();
		for(int check : candyType) {
			unique.add(check);
		}
		int maxCandies = candyType.length/2;
		int res = Math.min(unique.size(), maxCandies);
		
		return res;
	}
}
