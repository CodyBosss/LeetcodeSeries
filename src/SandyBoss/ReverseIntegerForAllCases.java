package SandyBoss;

public class ReverseIntegerForAllCases {
	public static void main(String [] args) {
		int num = -123456667;
		System.out.println(reverseInteger(num));
	}
	public static int reverseInteger(int num) {
		int rev = 0, rem;
		System.out.println(0%3);
		while(num!=0) {
			rem = num%10;
			num=num/10;
			if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10 && rem>7) return 0;
			if(rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE/10 && rem<-8) return 0;
			rev = rev*10+rem;
		}
		return rev;
	}
}
