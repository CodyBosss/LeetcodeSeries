package SandyBoss;

import java.util.Arrays;

/*You are given a large integer represented as an integer array digits, 
 * where each digits[i] is the ith digit of the integer. 
 * The digits are ordered from most significant to least significant in left-to-right order. 
 * The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.*/

public class PlusOne {
	
	public static void main(String [] args) {		
		int [] a = {1,2,3};	
		System.out.println(Arrays.toString(plusOne(a)));
	}
	
	public static int[] plusOne(int [] a) {
		for(int i=a.length-1; i>=0; i--) {
			a[i]++;
			if(a[i]<10) {
				return a;
			}
			a[i]=0;
		}
		int[] res = new int[a.length+1];
		res[0]=1;
		return res;
	}

}
