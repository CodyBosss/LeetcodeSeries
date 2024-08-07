package SandyBoss;

import java.math.BigInteger;

public class MultiplyStrings {
	public static void main(String[] args) {
		String str1 = "2";
		String str2 = "3";
		System.out.println(multiplyStr(str1, str2));
	}

	static String multiplyStr(String str1, String str2) {
		BigInteger num1 = new BigInteger(str1);
		BigInteger num2 = new BigInteger(str2);
		BigInteger res = num1.multiply(num2);
		
		return res.toString();
	}
}
