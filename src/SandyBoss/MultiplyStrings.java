package SandyBoss;

import java.math.BigInteger;

public class MultiplyStrings {
	public static void main(String[] args) {
		String str1 = "2";
		String str2 = "3";
		System.out.println(multiplyStr(str1, str2));
	}

	static String multiplyStr(String str1, String str2) {
		
		//1st approach
		BigInteger num1 = new BigInteger(str1);
		BigInteger num2 = new BigInteger(str2);
		BigInteger res = num1.multiply(num2);
//		System.out.println(res);
		
		//2nd approach
		Integer v1 = Integer.parseInt(str1);
		Integer v2 = Integer.parseInt(str2);
		
		
		
		return Integer.toString(v1*v2);
	}
}
