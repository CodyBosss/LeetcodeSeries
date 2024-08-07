package BitManipulation;

import java.util.Scanner;

//Write a program to find if a number is a power of 2 or not.

public class PowerOfTwoOrNot {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pos = 1;
		int bitMask = 1<<pos;		
		
		
			int newBitMask = ~(bitMask);
			int newNumber = newBitMask & num;
			System.out.println("Power of 2 : "+newNumber);
		
	}
}
