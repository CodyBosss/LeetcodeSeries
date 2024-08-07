package SandyBoss;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class IntegerToRoman {
	public static void main(String[] args) {
		int num = 3749;
		System.out.println(intToRoman(num));
	}

	public static String intToRoman(int num) {
		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		map.put(1,"I");
		map.put(4,"IV");
		map.put(5,"V");
		map.put(9,"IX");
		map.put(10,"X");
		map.put(40,"XL");
		map.put(50,"L");
		map.put(90,"XC");
		map.put(100,"C");
		map.put(400,"CD");
		map.put(500,"D");
		map.put(900,"CM");
		map.put(1000,"M");
		StringBuilder sb = new StringBuilder();
		for(int key : map.keySet()) {
			while(num>=key) {
				sb.append(map.get(key));
				num-=key;
			}
		}
		return sb.toString();
	}
}
