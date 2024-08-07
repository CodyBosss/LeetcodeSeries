package SandyBoss;

import java.util.Arrays;

public class NumberOfSegmentString {
	public static void main(String [] args) {
		String str = ",,,,,      a,sdfg";
		System.out.println(countSegment(str));
	}
	public static int countSegment(String str) {
		if(str==null || str.isEmpty()) {
			return 0;
		}
		String [] arr = str.trim().split("\\s+");		
		return arr.length;
	}
}
