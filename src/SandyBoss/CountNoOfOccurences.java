package SandyBoss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountNoOfOccurences {
	public static void main(String [] args) {
		String str = "Welcome to Mumbai, Welcome to Maharashtra";
		String occurences = "Welcome";
//		System.out.println(countOccurences(str, occurences));
//		sortStr(str);
		uniqueStr(str);
	}
	
	public static long countOccurences(String str, String occurences) {
		long count = Arrays.stream(str.split("\\s+"))
				.filter(w->w.equalsIgnoreCase(occurences)).count();
		return count;
	}
	
	public static void sortStr(String str) {
		String [] arr = str.split(" ");
		List<String> list = Arrays.asList(arr);
		list.stream().sorted().forEach(System.out::print);
	}
	
	public static void uniqueStr(String str) {
		String [] arr = str.split(" ");
		List<String> list = Arrays.asList(arr);
		list.stream().distinct().forEach(System.out::print);
	}
}
