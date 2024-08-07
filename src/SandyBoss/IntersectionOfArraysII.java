package SandyBoss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfArraysII {
	public static void main(String [] args) {
		int [] num1 = {1,2,2,1};
		int [] num2 = {2,2};
		System.out.println(Arrays.toString(intersection(num1, num2)));
	}
	public static int[] intersection(int [] num1, int [] num2) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int res : num1) {
			map.put(res, map.getOrDefault(res, 0)+1);
		}
		int i=0;
		int [] result = new int[Math.min(num1.length, num2.length)];
		for(int res : num2) {
			if(map.containsKey(res) && map.get(res)>0) {
				result[i++]=res;
				map.put(res, map.get(res)-1);				
			}			
		}
		return Arrays.copyOf(result, i);
	}
}

