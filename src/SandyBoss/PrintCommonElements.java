package SandyBoss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintCommonElements {
	public static void main(String [] args) {
		int arr [] = {0, 1, 2, 3, 4, 5, 6, 7};
		System.out.println(printCommon(arr));
	}
	public static ArrayList<Integer> printCommon(int arr []){
		ArrayList<Integer> list = new ArrayList<>();
		Set<Integer> hs = new HashSet<>();
		for(int res : arr) {
			if(hs.add(res)==false) {	
				list.add(res);
			}
		}
		if(list.isEmpty()) {
			list.add(-1);
		}		
		return list;
	}
}
