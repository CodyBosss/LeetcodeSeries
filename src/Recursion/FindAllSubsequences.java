package Recursion;

import java.util.ArrayList;

public class FindAllSubsequences {
	public static void main(String [] args) {
//		ArrayList<String> s = getSSQ("abc");
//		for(String ss : s) {
//			System.out.println(ss);
//		}
		SSQ("abc","");
	}
	public static ArrayList<String> getSSQ(String s){
		ArrayList<String> list = new ArrayList<>();
		if(s.length()==0) {
			list.add("");
			return list;
		}
		char curChar = s.charAt(0);
		ArrayList<String> smallAns = getSSQ(s.substring(1));
		
		for(String ss : smallAns) {
			list.add(ss);
			list.add(curChar+ss);
		}		
		return list;
	}
	
	//second approach
	static void SSQ(String s, String curAns) {
		if(s.length()==0) {
			System.out.println(curAns);
			return;
		}
		SSQ(s.substring(1),curAns+s.charAt(0));
		SSQ(s.substring(1),curAns);
	}
}
