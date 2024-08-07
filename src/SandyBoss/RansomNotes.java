package SandyBoss;

import java.util.HashMap;
import java.util.Map;

public class RansomNotes {
	public static void main(String [] args) {
		String rNote = "aa";
		String magazine = "aab";
		System.out.println(ransomNote(rNote, magazine));
	}
	public static boolean ransomNote(String ransomNote, String magazine) {
		Map<Character, Integer> magazineMap = new HashMap<>();        
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false; 
            }
            magazineMap.put(c, magazineMap.get(c) - 1);
        }        
        return true;
	}
}
