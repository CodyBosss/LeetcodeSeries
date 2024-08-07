package SandyBoss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	public static void main(String [] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		 System.out.println(groupAnagram(strs));
	    }

	    public static List<List<String>> groupAnagram(String[] strs) {
	        Map<String, List<String>> map = new HashMap<>();
	        for (String str : strs) {
	            char[] c = str.toCharArray();
	            Arrays.sort(c);
	            String sortedString = new String(c);
	            
	            if (!map.containsKey(sortedString)) {
	                map.put(sortedString, new ArrayList<>());	// new ArrayList<>(); it creates new line for each unique key                
	            }
	            map.get(sortedString).add(str);
	        }
	        return new ArrayList<>(map.values());
	        
	}
}
