package SandyBoss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1};
		Arrays.sort(a); // 1 1 2 3
		int k = 3;
		System.out.println(dupNum(a, k));
	}

	public static boolean dupNum(int[] a, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				int idx = map.get(a[i]);
				if(i-idx <= k) { //0-0<=3
					return true;
				}
			}			
		}
		return false;
	}
}
