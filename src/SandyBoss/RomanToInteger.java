package SandyBoss;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		String str = "LVIII";
		System.out.println(romanToInteger(str));
	}

	public static int romanToInteger(String str) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I',1);
		map.put('V',5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M',1000);
		
		int sum = 0;
		int prevValue = 0;
		for(int i=str.length()-1; i>=0; i--) {
			char curChar = str.charAt(i);
			int curValue = map.get(curChar);
			if(curValue<prevValue) {
				sum-=curValue;
			}
			else {
				sum+=curValue;
			}
		}
		return sum;
	}

}
