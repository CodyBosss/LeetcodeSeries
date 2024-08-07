package SandyBoss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
	public static void main(String [] args) {
		int [] arr = {1};//2  3  3
		System.out.println(majorityElement(arr));
	}
	public static List<Integer> majorityElement(int [] arr){
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		int mE = arr.length/3;
		for(int i=0; i<arr.length; i++) {			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>mE) {
				list.add(entry.getKey());
			}
		}
		return list;
	}
}
