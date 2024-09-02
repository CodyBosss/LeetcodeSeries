package SandyBoss;

import java.util.Arrays;

public class LemonadeChenges {
	
	public static void main(String [] args) {
		int bills [] = {5,5,20,5,5,10,5,10,5,20};
		System.out.println(lemonadeChanges(bills));
	}
	static boolean lemonadeChanges(int bills[]) {
		int five = 0, ten = 0;

       for(int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else { // bill == 20
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }           
        }
       return true;
	}	
}
